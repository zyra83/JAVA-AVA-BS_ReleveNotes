package relevenotes.model.dao;

import java.util.List;

import relevenotes.model.entities.Stagiaire;

public interface Dao<T, K> {

	void create(T t);

	void delete(T t);

	List<T> readAll();

	boolean exists(T t);

	Stagiaire read(K k);

	void update(T t);

}