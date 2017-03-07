package relevenotes.model.dao;

import relevenotes.model.entities.Stagiaire;

public final class DaoFactory {

	private DaoFactory() {
		// TODO Auto-generated constructor stub
	}

	public static Dao<Stagiaire, String>  fabriquerPersistenceMemoireStagiaires() {
		return new DaoStagiairesMemoire();
	}

	
	public static Dao<Stagiaire, String>  fabriquerPersistenceBddStagiaires() {
		return new DaoStagiairesMemoire();
	}

}
