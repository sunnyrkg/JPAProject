package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.entity.Department;
import com.entity.Employee;
import com.util.JPAUtil;

public class DepartmentDAO extends GenericDAO<Department> {

	public DepartmentDAO() {
		super(Department.class);
		// TODO Auto-generated constructor stub
	}
	public List<Employee> fetchAllEmployee()
	{
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> emp = criteriaQuery.from(Employee.class);
		criteriaQuery.select(emp);
		
		return entityManager.createQuery(criteriaQuery).getResultList();
	}
	
}
