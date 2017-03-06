package relevenote.view;

import java.util.Collection;

import relevenotes.model.entities.Stagiaire;

public interface Ihm {
	
	public final String MENU = "Heu MENU...";

	void afficherMenu();

	void afficher(String s);

	int saisir(int n, int s);

	double saisirNote(Stagiaire stagiaire);

	Stagiaire saisirStagiaire();

	void afficherLesStagiaires(Collection<Stagiaire> c);

}