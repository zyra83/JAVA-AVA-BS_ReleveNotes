package relevenotes.view;

import java.util.Collection;

import relevenotes.model.entities.Stagiaire;
import view.utils.LectureConsole;

public class MenuPrincipalConsole implements Ihm {

	public MenuPrincipalConsole() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficherMenu() {
		System.out.println("\n\n");
		for (String string : MENU) {
			System.out.println(string);
		}
	}

	@Override
	public void afficher(String s) {
		System.out.println("MenuPrincipalConsole.afficher() : " + s);
	}

	@Override
	public int saisir(int n, int s) {
		return LectureConsole.saisirEntier(n, s);
	}

	@Override
	public double saisirNote(Stagiaire stagiaire) {
		System.out.println("MenuPrincipalConsole.saisirNote()");
		return 0.0;
	}

	@Override
	public Stagiaire saisirStagiaire() {
		System.out.println("MenuPrincipalConsole.saisirStagiaire()");
		Stagiaire retour = new Stagiaire();
		retour.setIdentite(LectureConsole.saisirChaine());
		return retour;
	}

	@Override
	public void afficherLesStagiaires(Collection<Stagiaire> c) {
		System.out.println("MenuPrincipalConsole.afficherLesStagiaires()");
		for (Stagiaire stagiaire : c) {
			System.out.println(stagiaire.toString());
		}
	}

}
