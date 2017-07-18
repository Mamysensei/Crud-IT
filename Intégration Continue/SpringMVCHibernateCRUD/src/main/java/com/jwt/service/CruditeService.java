package com.jwt.service;

import java.util.List;

import com.jwt.model.Crudite;

public interface CruditeService {
	
	public void addCrudite(Crudite crudite);

	public List<Crudite> getAllCrudite();

	public void deleteCrudite(Integer cruditeId);

	public Crudite updateCrudite(Crudite crudite);

	public Crudite getCrudite(int cruditeid);
}
