package relevenote.view;

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

	}

	/* (non-Javadoc)
	 * @see relevenote.view.Ihm#afficher(java.lang.String)
	 */
	@Override
	public void afficher(String s) {

	}

	/* (non-Javadoc)
	 * @see relevenote.view.Ihm#saisir(int, int)
	 */
	@Override
	public int saisir(int n, int s) {
		return 0;
	}

	/* (non-Javadoc)
	 * @see relevenote.view.Ihm#saisirNote(relevenotes.model.entities.Stagiaire)
	 */
	@Override
	public double saisirNote(Stagiaire stagiaire) {
		return 0.0;
	}

	/* (non-Javadoc)
	 * @see relevenote.view.Ihm#saisirStagiaire()
	 */
	@Override
	public Stagiaire saisirStagiaire() {
		return null;
	}

	/* (non-Javadoc)
	 * @see relevenote.view.Ihm#afficherLesStagiaires(java.util.Collection)
	 */
	@Override
	public void afficherLesStagiaires(Collection<Stagiaire> c) {

	}

}
