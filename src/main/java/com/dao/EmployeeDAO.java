package com.dao;

import java.nio.file.attribute.AclEntry.Builder;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import com.entity.Department;
import com.entity.Employee;
import com.util.JPAUtil;

public class EmployeeDAO extends GenericDAO<Employee>{

	public EmployeeDAO() {
		super(Employee.class);
		// TODO Auto-generated constructor stub
	}
	public List<Object[]> fetchEmployeesPartialDetails(String...arg)
	{
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
		Root<Employee> emp = criteriaQuery.from(Employee.class);
		criteriaQuery.multiselect(emp.get("uid"),emp.get("department"));	
		return entityManager.createQuery(criteriaQuery).getResultList();
	}
	public List<Employee> fetchEmployeeBySalary(int uid)
	{
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> emp = criteriaQuery.from(Employee.class);
		criteriaQuery.select(emp);
		criteriaQuery.where(criteriaBuilder.ge(emp.get("uid"),uid));
		return entityManager.createQuery(criteriaQuery).getResultList();
		
		
	}
	public List<Employee> fetchEmployeeByNameAndUid(int uid,String wildCard)
	{
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> emp = criteriaQuery.from(Employee.class);
		criteriaQuery.select(emp);
		criteriaQuery.where(
				criteriaBuilder.and(
				criteriaBuilder.ge(emp.get("uid"),uid),
				criteriaBuilder.like(emp.get("firstName"),wildCard)
				));
		return entityManager.createQuery(criteriaQuery).getResultList();
		
		
	}
	public List<Employee> fetchEmployeeByDepartmentName(String deptName)
	{
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> emp = criteriaQuery.from(Employee.class);
		Join<Employee,Department> dept = emp.join("department",JoinType.INNER);
		criteriaQuery.where(criteriaBuilder.equal(dept.<String>get("departmentName"),deptName));
		return entityManager.createQuery(criteriaQuery).getResultList();
		
	}
}
