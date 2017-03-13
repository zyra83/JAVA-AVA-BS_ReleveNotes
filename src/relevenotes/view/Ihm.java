package relevenotes.view;

import java.util.Collection;

import relevenotes.model.entities.Stagiaire;

public interface Ihm {

	public final String[] MENU = new String[] { "1 - ajouter un stagiaire", "2 - afficher par ordre alphabétique",
		      "3 - afficher par ordre de mérite", "4 - saisir les notes d'un test","5 - initialiser les données de test", "0 - Quitter" };

	void afficherMenu();

	void afficher(String s);

	int saisir(int n, int s);

	double saisirNote(Stagiaire stagiaire);

	Stagiaire saisirStagiaire();

	void afficherLesStagiaires(Collection<Stagiaire> c);

}