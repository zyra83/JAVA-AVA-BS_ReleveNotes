package relevenotes.model.facade;

import java.util.Collections;
import java.util.List;

import relevenotes.model.contracts.FacadeMetier;
import relevenotes.model.dao.Dao;
import relevenotes.model.dao.DaoFactory;
import relevenotes.model.entities.Stagiaire;
import relevenotes.model.entities.comparators.MoyenneComparator;
import relevenotes.refs.Matiere;

public class FacadeMetierImpl implements FacadeMetier {

	private Dao<Stagiaire, String> persistanceStagiaires = DaoFactory.fabriquerPersistenceMemoireStagiaires();

	@Override
	public void ajouterStagiaire(Stagiaire stagiaire) {
		System.out.println("FacadeMetierImpl.ajouterStagiaire()");

		persistanceStagiaires.create(stagiaire);
	}

	@Override
	public void ajouterNote(Matiere matiere, double d, Stagiaire s) {
		s.ajouterNote(matiere, d);
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
	
		riri.ajouterNote(Matiere.JAVA, 20);
		fifi.ajouterNote(Matiere.JAVA, 15);
		loulou.ajouterNote(Matiere.JAVA, 10);
		
		persistanceStagiaires.create(riri);
		persistanceStagiaires.create(fifi);
		persistanceStagiaires.create(loulou);
	}
	
	

}
