package relevenotes.presenter;

import relevenotes.model.contracts.FacadeMetier;
import relevenotes.view.Ihm;

public class PresenterPrincipal {

	private FacadeMetier leMetier;
	private Ihm laVue;
	
	public PresenterPrincipal(FacadeMetier fm, Ihm ihm) {
		this.laVue = ihm;
		this.leMetier = fm;
	}
	
	public void executer(){
		laVue.afficherMenu();
	}
}
