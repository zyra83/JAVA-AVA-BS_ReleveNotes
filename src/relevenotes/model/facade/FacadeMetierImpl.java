package relevenotes.model.facade;

import java.util.Collections;
import java.util.List;

import relevenotes.model.contracts.FacadeMetier;
import relevenotes.model.dao.Dao;
import relevenotes.model.dao.DaoFactory;
import relevenotes.model.entities.Stagiaire;
import relevenotes.model.entities.comparators.MoyenneComparator;

public class FacadeMetierImpl implements FacadeMetier {

	private Dao<Stagiaire, String> persistanceStagiaires = DaoFactory.fabriquerPersistenceMemoireStagiaires();

	@Override
	public void ajouterStagiaire(Stagiaire stagiaire) {
		System.out.println("FacadeMetierImpl.ajouterStagiaire()");

		persistanceStagiaires.create(stagiaire);
	}

	@Override
	public void ajouterNote(double d, Stagiaire s) {
		s.ajouterNote(d);
	}

	@Override
	public List<Stagiaire> listerStagiaires() {
		return persistanceStagiaires.readAll();
	}

	@Override
	public List<Stagiaire> listerStagiairesOrdreAlphabetique() {
		List<Stagiaire> l = persistanceStagiaires.readAll();
		Collections.sort(l);
		return l;
	}

	@Override
	public List<Stagiaire> listerStagiairesOrdreDeMerite() {
		List<Stagiaire> l = persistanceStagiaires.readAll();
		Collections.sort(l, new MoyenneComparator());
		return l;
	}

	@Override
	public void initialiserDonneesBidons() {
		Stagiaire riri = new Stagiaire();
		riri.setIdentite("riri");

		Stagiaire fifi = new Stagiaire();
		fifi.setIdentite("fifi");

		Stagiaire loulou = new Stagiaire();
		loulou.setIdentite("loulou");

		riri.ajouterNote(20);
		loulou.ajouterNote(10);
		fifi.ajouterNote(15);

		persistanceStagiaires.create(riri);
		persistanceStagiaires.create(loulou);
		persistanceStagiaires.create(fifi);
	}

}
