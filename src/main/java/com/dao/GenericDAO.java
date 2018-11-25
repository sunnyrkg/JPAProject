package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import com.util.JPAUtil;
public class GenericDAO<T> {
	
	Class clazz;
	
	public GenericDAO(Class clazz) {
		super();
		this.clazz = clazz;
	}
	
	public void insert(T object)
	{
			//Create obtain EntitryManager factory object.
			EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();
			//Create and obtain EntitryManager object.
			EntityManager em = emf.createEntityManager();
			//Allot with a transaction.
			EntityTransaction tx = em.getTransaction();
			//Now we can insert/update/delete/update
			tx.begin();
			em.persist(object);
			em.flush();
			tx.commit();
	}
	public List<T> fetchAll()
	{
			EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			try
			{
				Query query = entityManager.createQuery("SELECT c FROM "+this.clazz.getName()+" AS c");
				return query.getResultList();
			}
			finally
			{
				entityManager.close();
			}
	}
	public T fetchById(int uid)
	{
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try
		{
			T object = (T)entityManager.find(clazz,uid);
			return object;
		}
		finally
		{
			entityManager.close();
		}
	}
	public void update(T object)
	{
		//Create obtain EntitryManager factory object.
		EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();
		//Create and obtain EntitryManager object.
		EntityManager em = emf.createEntityManager();
		//Allot with a transaction.
		EntityTransaction tx = em.getTransaction();
		//Now we can insert/update/delete/update
		tx.begin();
		em.merge(object);
		tx.commit();
	}

}
