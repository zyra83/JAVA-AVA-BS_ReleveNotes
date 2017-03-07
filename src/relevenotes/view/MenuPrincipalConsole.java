package relevenotes.view;

import java.util.Collection;

import relevenotes.model.entities.Stagiaire;

public class MenuPrincipalConsole implements Ihm {

	public MenuPrincipalConsole() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see relevenote.view.Ihm#afficherMenu()
	 */
	@Override
	public void afficherMenu() {
		System.out.println("MenuPrincipalConsole.afficherMenu()");
		for (String string : MENU) {
			System.out.println(string);
		}
		int choix = view.utils.LectureConsole.saisirEntier();
		view.utils.LectureConsole.afficherMessageAvecSautLigne("Vous avez saisis : " + choix);
		
	}

	/* (non-Javadoc)
	 * @see relevenote.view.Ihm#afficher(java.lang.String)
	 */
	@Override
	public void afficher(String s) {
		System.out.println("MenuPrincipalConsole.afficher() : " + s);
	}

	/* (non-Javadoc)
	 * @see relevenote.view.Ihm#saisir(int, int)
	 */
	@Override
	public int saisir(int n, int s) {
		System.out.println("MenuPrincipalConsole.saisir()");
		return 0;
	}

	/* (non-Javadoc)
	 * @see relevenote.view.Ihm#saisirNote(relevenotes.model.entities.Stagiaire)
	 */
	@Override
	public double saisirNote(Stagiaire stagiaire) {
		System.out.println("MenuPrincipalConsole.saisirNote()");
		return 0.0;
	}

	/* (non-Javadoc)
	 * @see relevenote.view.Ihm#saisirStagiaire()
	 */
	@Override
	public Stagiaire saisirStagiaire() {
		System.out.println("MenuPrincipalConsole.saisirStagiaire()");
		return null;
	}

	/* (non-Javadoc)
	 * @see relevenote.view.Ihm#afficherLesStagiaires(java.util.Collection)
	 */
	@Override
	public void afficherLesStagiaires(Collection<Stagiaire> c) {
		System.out.println("MenuPrincipalConsole.afficherLesStagiaires()");
		for (Stagiaire stagiaire : c) {
			System.out.println(stagiaire.toString());
		}
	}

}
