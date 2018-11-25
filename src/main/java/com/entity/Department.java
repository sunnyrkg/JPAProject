package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dao.DepartmentDAO;

@Entity
@Table(name="TBL_DEPT")
public class Department {
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int uid, String departmentName) {
		super();
		this.uid = uid;
		this.departmentName = departmentName;
	}
	
	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}

	@Id @GeneratedValue private int uid;
	@Column private String departmentName;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER) 
	@JoinColumn(name="dept_fk")
	private Set<Employee> employees;
	/**
	 * @return the uid
	 */
	public int getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}
	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * @return the employees
	 */
	public Set<Employee> getEmployees() {
		return employees;
	}
	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	public static DepartmentDAO getDAO()
	{
		return new DepartmentDAO();
	}
	
}
