package relevenotes.model.contracts;

import java.util.List;

import relevenotes.model.entities.Stagiaire;
import relevenotes.refs.Matiere;

public interface FacadeMetier {

	void ajouterStagiaire(Stagiaire stagiaire);

	void ajouterNote(Matiere matiere, double d, Stagiaire s);

	List<Stagiaire> listerStagiaires();

	List<Stagiaire> listerStagiairesOrdreAlphabetique();

	List<Stagiaire> listerStagiairesOrdreDeMerite();

	void initialiserDonneesBidons();

}