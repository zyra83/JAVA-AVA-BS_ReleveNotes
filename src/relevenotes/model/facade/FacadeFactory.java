package relevenotes.model.facade;

public class FacadeFactory {
	public FacadeMetierImpl fabriquerFacadeMetier() {
		return new FacadeMetierImpl();
	}
}
