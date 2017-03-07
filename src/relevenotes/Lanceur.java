package relevenotes;

import relevenotes.model.contracts.FacadeMetier;
import relevenotes.model.facade.FacadeFactory;
import relevenotes.presenter.PresenterPrincipal;
import relevenotes.view.Ihm;
import relevenotes.view.VueFactory;

public class Lanceur {

	public static void main(String[] args) {

		FacadeMetier fm = FacadeFactory.fabriquerFacadeMetier();
		Ihm ihm = VueFactory.fabriquerVueConsole();
		PresenterPrincipal prez = new PresenterPrincipal(fm, ihm);
		prez.executer();

	}
}
