package com.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.entity.Customer;
import com.util.JPAUtil;

public class CustomerDAO {
	public void add(Customer customer)
	{
		//Create obtain EntitryManager factory object.
		EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();
		//Create and obtain EntitryManager object.
		EntityManager em = emf.createEntityManager();
		//Allot with a transaction.
		EntityTransaction tx = em.getTransaction();
		//Now we can insert/update/delete/update
		tx.begin();
		em.persist(customer);
		tx.commit();
	}
	public Customer fetchById(int uid)
	{
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try
		{
			Customer customer = (Customer)entityManager.find(Customer.class, 12);
			return customer;
		}
		finally
		{
			entityManager.close();
		}
	}
	public List<Customer> fetchAll()
	{
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query =  entityManager.createQuery("SELECT c FROM Customer as c"); //HQL
		try
		{
			return query.getResultList();
		}
		finally
		{
			entityManager.close();
		}
	}
}
