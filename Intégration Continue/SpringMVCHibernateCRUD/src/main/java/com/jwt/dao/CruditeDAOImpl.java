package com.jwt.dao;
 
import java.util.List;
 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Crudite;
 
@Repository
public class CruditeDAOImpl implements CruditeDAO {
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public void addCrudite(Crudite crudite) {
        sessionFactory.getCurrentSession().saveOrUpdate(crudite);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Crudite> getAllCrudite() {
 
        return sessionFactory.getCurrentSession().createQuery("from Crudite")
                .list();
    }
 
    @Override
    public void deleteCrudite(Integer cruditeId) {
    	Crudite crudite = (Crudite) sessionFactory.getCurrentSession().load(
    			Crudite.class, cruditeId);
        if (null != crudite) {
            this.sessionFactory.getCurrentSession().delete(crudite);
        }
 
    }
 
    public Crudite getCrudite(int crudid) {
        return (Crudite) sessionFactory.getCurrentSession().get(
        		Crudite.class, crudid);
    }
 
    @Override
    public Crudite updateCrudite(Crudite crudite) {
        sessionFactory.getCurrentSession().update(crudite);
        return crudite;
    }
 
}