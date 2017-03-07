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

	@Override
	public void create(Stagiaire stagiaire) {
		// tester qu'il n'est pas nul ou n'existe pas déjà
		this.setStagiaire.add(stagiaire);
	}

	@Override
	public void delete(Stagiaire stagiaire) {
		setStagiaire.remove(stagiaire);
	}

	@Override
	public List<Stagiaire> readAll() {
		return new ArrayList<>(setStagiaire);
	}

	@Override
	public boolean exists(Stagiaire stagiaire) {
		return setStagiaire.contains(stagiaire);
	}


	@Override
	public Stagiaire read(String s) {
		for (Stagiaire stagiaire : setStagiaire) {
			if (stagiaire.getIdentite().equals(s)) {
				return stagiaire;
			}
		}
		return null;
	}

	@Override
	public void update(Stagiaire s) {
		int indice = setStagiaire.indexOf(s);
		setStagiaire.remove(indice);
		create(s);
	}

}
