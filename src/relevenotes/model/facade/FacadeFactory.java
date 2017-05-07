package relevenotes.model.facade;

import relevenotes.model.contracts.FacadeMetier;

public final class FacadeFactory {
	private FacadeFactory() {
		// TODO Auto-generated constructor stub
	}

	public static FacadeMetier fabriquerFacadeMetier() {
		return new FacadeMetierImpl();
	}
}
