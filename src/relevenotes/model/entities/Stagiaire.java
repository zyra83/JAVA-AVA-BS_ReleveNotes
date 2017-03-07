package relevenotes.model.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import relevenotes.model.entities.exceptions.CalculMoyenneImpossibleException;

/**
 * Le stagiaire
 * 
 * @author VOTRE_NOM
 *
 */
public class Stagiaire implements Comparable<Stagiaire> {
	// MEP logger
	public static final Logger LOG = LogManager.getLogger(Stagiaire.class.getSimpleName());
	
	// ATTRIBUTS

	private String identite;
	/**2
	 * Instancier dans le constructeur sinon ça fait gueuler le CDT Robin
	 */
	private List<Double> releveNotes = new ArrayList<>();

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
	public List<Double> getReleveNotes() {
		
		// 1 retourne une copie de la liste
		// return new ArrayList<>(this.releveNotes);
		// 2 retourne la liste mais en lecture seule.

		return Collections.unmodifiableList(this.releveNotes);
	}

	// METHODES DEMANDES
	/**
	 * Calcule la moyenne des notes de la liste releveNote.
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

		double total = 0;
		for (Double note : releveNotes) {
			total += note;
		}
		return total / releveNotes.size();
	}

	public void ajouterNote(double note) {
		this.releveNotes.add(note);
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

		return this.identite.compareTo(other.getIdentite());

	}

}
