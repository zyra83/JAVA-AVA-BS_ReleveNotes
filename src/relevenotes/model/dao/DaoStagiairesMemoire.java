package relevenotes.model.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import relevenotes.model.entities.Stagiaire;

public class DaoStagiairesMemoire implements Dao<Stagiaire, String> {

	private List<Stagiaire> setStagiaire = new ArrayList<>();

	public DaoStagiairesMemoire() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * relevenotes.model.dao.Dao#create(relevenotes.model.entities.Stagiaire)
	 */
	@Override
	public void create(Stagiaire stagiaire) {
		this.setStagiaire.add(stagiaire);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * relevenotes.model.dao.Dao#delete(relevenotes.model.entities.Stagiaire)
	 */
	@Override
	public void delete(Stagiaire stagiaire) {
		setStagiaire.remove(stagiaire);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see relevenotes.model.dao.Dao#readAll()
	 */
	@Override
	public List<Stagiaire> readAll() {
		return Collections.unmodifiableList(setStagiaire);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * relevenotes.model.dao.Dao#exists(relevenotes.model.entities.Stagiaire)
	 */
	@Override
	public boolean exists(Stagiaire stagiaire) {
		return setStagiaire.contains(stagiaire);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see relevenotes.model.dao.Dao#read(java.lang.String)
	 */
	@Override
	public Stagiaire read(String s) {
		for (Stagiaire stagiaire : setStagiaire) {
			if (stagiaire.getIdentite().equals(s)) {
				return stagiaire;
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * relevenotes.model.dao.Dao#update(relevenotes.model.entities.Stagiaire)
	 */
	@Override
	public void update(Stagiaire s) {
		// TODO à retreavailler c'est surement crade comme méthode ça...
		Stagiaire old = read(s.getIdentite());
		setStagiaire.remove(old);
		create(s);
	}

}
