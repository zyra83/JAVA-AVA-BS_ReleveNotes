package relevenotes.model.contracts;

import java.util.List;

import relevenotes.model.entities.Stagiaire;

public interface FacadeMetier {

	void ajouterStagiaire(Stagiaire stagiaire);

	void ajouterNote(double d, Stagiaire s);

	List<Stagiaire> listerStagiaires();

	List<Stagiaire> listerStagiairesOrdreAlphabetique();

	List<Stagiaire> listerStagiairesOrdreDeMerite();

}