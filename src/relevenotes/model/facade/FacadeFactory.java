package relevenotes.model.facade;

public final class FacadeFactory {
	private FacadeFactory() {
		// TODO Auto-generated constructor stub
	}

	public static FacadeMetierImpl fabriquerFacadeMetier() {
		return new FacadeMetierImpl();
	}
}
