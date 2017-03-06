package relevenotes.model.facade;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import relevenotes.model.contracts.FacadeMetier;
import relevenotes.model.dao.Dao;
import relevenotes.model.entities.Stagiaire;
import relevenotes.model.entities.comparators.MoyenneComparator;

public class FacadeMetierImpl implements FacadeMetier {

	private Dao persistanceStagiaires;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * relevenotes.model.facade.FacadeMetier#ajouterStagiaire(relevenotes.model.
	 * entities.Stagiaire)
	 */
	@Override
	public void ajouterStagiaire(Stagiaire stagiaire) {
		persistanceStagiaires.create(stagiaire);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see relevenotes.model.facade.FacadeMetier#ajouterNote(double,
	 * relevenotes.model.entities.Stagiaire)
	 */
	@Override
	public void ajouterNote(double d, Stagiaire s) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see relevenotes.model.facade.FacadeMetier#listerStagiaires()
	 */
	@Override
	public List<Stagiaire> listerStagiaires() {
		return Collections.unmodifiableList(persistanceStagiaires.readAll());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * relevenotes.model.facade.FacadeMetier#listerStagiairesOrdreAlphabetique()
	 */
	@Override
	public List<Stagiaire> listerStagiairesOrdreAlphabetique() {
		List<Stagiaire> l = persistanceStagiaires.readAll();
		Collections.sort(l);
		return l;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * relevenotes.model.facade.FacadeMetier#listerStagiairesOrdreDeMerite()
	 */
	@Override
	public List<Stagiaire> listerStagiairesOrdreDeMerite() {
		Collections.sort(persistanceStagiaires.readAll(), new MoyenneComparator());

		return null;
	}

}
