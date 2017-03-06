import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import relevenotes.model.entities.Stagiaire;
import relevenotes.model.entities.comparators.MoyenneComparator;
import relevenotes.model.exceptions.CalculMoyenneImpossibleException;

public class Lanceur {

	public static void main(String[] args) {

		Stagiaire s1 = new Stagiaire();
		s1.setIdentite("riri");
		s1.ajouterNote(3);
		s1.ajouterNote(3);
		
		Stagiaire s2 = new Stagiaire();
		s2.setIdentite("fifi");
		s2.ajouterNote(5);
		s2.ajouterNote(6);
		
		Stagiaire s3 = new Stagiaire();
		s3.setIdentite("loulou");
		s3.ajouterNote(00);
		s3.ajouterNote(10);
		
		List<Stagiaire> classe = new ArrayList<>();
		classe.add(s1);
		classe.add(s2);
		classe.add(s3);
		
		Collections.sort(classe);
		
		for (Stagiaire stagiaire : classe) {
			System.out.println(stagiaire);
		}
		
		
		
		Collections.sort(classe, new MoyenneComparator());
		
		for (Stagiaire stagiaire : classe) {
			System.out.println(stagiaire);
		}
		
		
		
		
		
		try {
			s1.calculerMoyenne();
		} catch (CalculMoyenneImpossibleException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		

	}
}
