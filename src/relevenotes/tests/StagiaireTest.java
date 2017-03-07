package relevenotes.tests;

import org.junit.Test;

import relevenotes.model.entities.Stagiaire;
import relevenotes.model.exceptions.CalculMoyenneImpossibleException;

public class StagiaireTest {

	@Test(expected = CalculMoyenneImpossibleException.class)
	public void testCalculerMoyenneAVide() throws CalculMoyenneImpossibleException {

		Stagiaire s = new Stagiaire();
		s.calculerMoyenne();
	}
	
	

}
