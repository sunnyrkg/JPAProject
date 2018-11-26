package com.dao;

import com.entity.Product;

public class ProductDAO extends GenericDAO<Product> {

	public ProductDAO() {
		super(Product.class);
		// TODO Auto-generated constructor stub
	}
	/*public double fetchBalance(int accountUid)
	{
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String jpql = "SELECT a.balance FROM Account a WHERE a.accNo=:accountUid";
		
		Query query = entityManager.createQuery(jpql);
		query.setParameter("accountUid", accountUid);
		return (Double)query.getSingleResult();
		
	}
	public List<Transaction> getMiniStatement(int accNo)
	{
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String jpql = "SELECT t FROM Transaction t WHERE t.account.accNo=:accountUid ORDER BY t.date DESC";
		
		Query query = entityManager.createQuery(jpql);
		query.setParameter("accountUid", accNo);
		query.setMaxResults(3);
		return query.getResultList();
		
	}
	public List<Account> fetchAcountsByTransaction(double amount)
	{
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String jpql = "SELECT DISTINCT acc FROM Account acc JOIN acc.trans_uid transaction WHERE transaction.amount>=:amount ORDER BY acc.accNo ASC";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("amount", amount);
		return query.getResultList();	
	}
	public List<Account> fetchAccountWithHighestAmount()
	{
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();	
		String jpql = "SELECT DISTINCT t.account FROM Transaction t WHERE t.amount = (SELECT MAX(t.amount) FROM Transaction t)";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
		
	
	}*/
}
