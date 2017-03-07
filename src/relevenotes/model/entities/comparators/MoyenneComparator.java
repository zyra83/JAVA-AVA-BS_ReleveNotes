package relevenotes.model.entities.comparators;

import java.util.Comparator;

import relevenotes.model.entities.Stagiaire;
import relevenotes.model.entities.exceptions.CalculMoyenneImpossibleException;

public class MoyenneComparator implements Comparator<Stagiaire> {

	@Override
	public int compare(Stagiaire o1, Stagiaire o2) {
		try {
			return Double.compare(o1.calculerMoyenne(), o2.calculerMoyenne());
		} catch (CalculMoyenneImpossibleException e) {
			// bon c'est crade, ça dégage les 2 en fin de liste vu qu'on ne sait pas lequel n'a pas de note.
			return -1;
		}

	}

}
