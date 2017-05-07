package relevenotes.model.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import relevenotes.model.entities.exceptions.CalculMoyenneImpossibleException;
import relevenotes.refs.Matiere;

/**
 * Le stagiaire
 * 
 * @author VOTRE_NOM
 *
 */
public class Stagiaire implements Comparable<Stagiaire> {
	// MEP logger
	public static final Log LOG = LogFactory.getLog(Stagiaire.class.getSimpleName());

	// ATTRIBUTS

	private String identite;
	/**
	 * 2 Instancier dans le constructeur sinon ça fait gueuler le CDT Robin
	 */
	private Map<Matiere, List<Double>> releveNotes = new HashMap<>();

	public Stagiaire() {
		// Cosntructeur vide de bean
		LOG.info("Instanciation d'un nouveau Stagiaire");
	}

	// ACCESSEURS

	public String getIdentite() {
		return identite;
	}

	public void setIdentite(String identite) {
		this.identite = identite;
	}

	/**
	 * On evité de mettre le setter pour les listes
	 * 
	 * @return
	 */
	public List<Double> getReleveNotes(Matiere matiere) {

		// 1 retourne une copie de la liste
		// return new ArrayList<>(this.releveNotes);
		// 2 retourne la liste mais en lecture seule.

		return Collections.unmodifiableList(this.releveNotes.get(matiere));
	}

	// METHODES DEMANDES
	/**
	 * Calcule la moyenne pondérée des notes de la liste releveNote.
	 * 
	 * @return
	 * @throws CalculMoyenneImpossibleException
	 *             sera levée lorsque le relevé de note ne contient pas de note.
	 */
	public Double calculerMoyenne() throws CalculMoyenneImpossibleException {
		// si la liste est vide, je lève une exception perso
		if (releveNotes.size() == 0) {
			throw new CalculMoyenneImpossibleException();
		}

		// coef total pour la moyenne pondérée
		double totalCoefs = 0;
		// total des notes pour la moyenne pondérée
		double totalNotes = 0;

		// On parcours la liste des matières
		for (Entry<Matiere, List<Double>> entry : releveNotes.entrySet()) {
			
			Matiere matiere = entry.getKey();
			List<Double> lstNotesMatiere = entry.getValue();
			
			// on parcours la liste des notes de la matière en cours.
			for (Double note : lstNotesMatiere) {
				totalCoefs += matiere.getCoef();
				// pondération de la note par le coef de la matière
				totalNotes += note * matiere.getCoef();
			}
		}
		
		// moyenne pondérée
		return totalNotes / totalCoefs;
	}

	/**
	 * Si la matière n'a jamais eu de note on crée une liste de notes vide pour
	 * la matière. Dans tous les cas, après, on ajoute la note à la liste de
	 * notes de la matière.
	 * 
	 * @param matiere
	 * @param note
	 */
	public void ajouterNote(Matiere matiere, double note) {
		if (!releveNotes.containsKey(matiere)) {
			releveNotes.put(matiere, new ArrayList<>());
		}
		this.releveNotes.get(matiere).add(note);
	}

	// equals hashs code

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identite == null) ? 0 : identite.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stagiaire other = (Stagiaire) obj;
		if (identite == null) {
			if (other.identite != null)
				return false;
		} else if (!identite.equals(other.identite))
			return false;
		return true;
	}

	// to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Stagiaire [identite=");
		builder.append(identite);
		builder.append(", releveNotes=");
		builder.append(releveNotes);
		builder.append("]");
		LOG.info("ToString d'un Stagiaire");
		return builder.toString();
	}

	@Override
	public int compareTo(Stagiaire other) {
		// compareTo should return < 0 if this is supposed to be
		// less than other, > 0 if this is supposed to be greater than
		// other and 0 if they are supposed to be equal
		// this.calculerMoyenne().compareTo(other.calculerMoyenne()).par;

		return this.getIdentite().compareTo(other.getIdentite());

	}

}
