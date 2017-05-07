package relevenotes.model.entities.exceptions;

@SuppressWarnings("serial")
public class CalculMoyenneImpossibleException extends Exception {

	public CalculMoyenneImpossibleException() {
		super(Messages.MSG_CALCUL_MOYENNE_IMPOSSIBLE);
	}

}
