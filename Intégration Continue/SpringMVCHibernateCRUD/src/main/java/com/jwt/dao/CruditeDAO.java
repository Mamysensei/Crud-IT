package com.jwt.dao;

import java.util.List;
import com.jwt.model.Crudite;

public interface CruditeDAO {

	public void addCrudite(Crudite crudite);

	public List<Crudite> getAllCrudite();

	public void deleteCrudite(Integer cruditeId);

	public Crudite updateCrudite(Crudite crudite);

	public Crudite getCrudite(int cruditeid);
}
