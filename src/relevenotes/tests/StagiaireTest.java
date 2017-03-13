package relevenotes.tests;

import org.junit.Assert;
import org.junit.Test;

import relevenotes.model.entities.Stagiaire;
import relevenotes.model.entities.exceptions.CalculMoyenneImpossibleException;
import relevenotes.refs.Matiere;

public class StagiaireTest {

	@Test(expected = CalculMoyenneImpossibleException.class)
	public void testCalculerMoyenneAVide() throws CalculMoyenneImpossibleException {

		Stagiaire s = new Stagiaire();
		s.calculerMoyenne();
	}

	@Test
	public void testCalculerMoyennePonderee() throws CalculMoyenneImpossibleException {
		Stagiaire s = new Stagiaire();
		s.ajouterNote(Matiere.JAVA, 10);
		s.ajouterNote(Matiere.JAVA, 20);
		s.ajouterNote(Matiere.UML, 5);
		s.ajouterNote(Matiere.SQL, 19);

		Assert.assertEquals(13.166667, s.calculerMoyenne(), 0.01);
	}

}
