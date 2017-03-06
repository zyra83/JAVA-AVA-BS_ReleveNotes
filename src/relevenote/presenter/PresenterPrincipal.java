package relevenote.presenter;

import relevenote.view.Ihm;
import relevenotes.model.contracts.FacadeMetier;

public class PresenterPrincipal {

	private FacadeMetier leMetier;
	private Ihm laVue;
	
	public PresenterPrincipal(FacadeMetier fm, Ihm ihm) {
		this.laVue = ihm;
		this.leMetier = fm;
	}
	
	public void executer(){
		
	}
}
