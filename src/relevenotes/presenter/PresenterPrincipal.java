package relevenotes.presenter;

import java.util.List;

import relevenotes.model.contracts.FacadeMetier;
import relevenotes.model.entities.Stagiaire;
import relevenotes.view.Ihm;

public class PresenterPrincipal {

	private FacadeMetier leMetier;
	private Ihm laVue;

	public PresenterPrincipal(FacadeMetier fm, Ihm ihm) {
		this.laVue = ihm;
		this.leMetier = fm;
	}

	public void executer() {
		while (true) {
			laVue.afficherMenu();
			int choix = laVue.saisir(0, 4);

			switch (choix) {

			case 1:
				leMetier.ajouterStagiaire(laVue.saisirStagiaire());
				break;
			case 2:
				List<Stagiaire> listeStagiairesTries = leMetier.listerStagiairesOrdreAlphabetique();
				laVue.afficherLesStagiaires(listeStagiairesTries);
				break;
			case 3:
				List<Stagiaire> listeStagiairesTriesOM = leMetier.listerStagiairesOrdreDeMerite();
				laVue.afficherLesStagiaires(listeStagiairesTriesOM);
				break;
			case 4:
				// laVue.saisirNote(stagiaire);
				break;
			case 0:
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
}
