package relevenotes.model.dao;

public final class DaoFactory {

	private DaoFactory() {
		// TODO Auto-generated constructor stub
	}

	public DaoStagiairesMemoire fabriquerPersistenceMemoireStagiaires() {
		return new DaoStagiairesMemoire();
	}

}
