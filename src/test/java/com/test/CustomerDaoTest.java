package com.test;

import java.util.List;

import org.junit.Test;

import com.dao.GenericDAO;
import com.entity.CarPart;
import com.entity.Department;
import com.entity.Employee;

public class CustomerDaoTest {

	@Test
	public void addDepartment()
	{
		Department department = new Department("InfoTech");
		Department department2 = new Department("Human Resource");
		Department department3 = new Department("Devlopment");
		GenericDAO<Department> dao = new GenericDAO<>(Department.class);
		dao.insert(department);
		dao.insert(department2);
		dao.insert(department3);
	}
	@Test
	public void addEmployee()
	{
		GenericDAO<Department> department_dao = new GenericDAO<>(Department.class);
		GenericDAO<Employee> employee_dao = new GenericDAO<>(Employee.class);
		List<Department> listOfDepartment = department_dao.fetchAll();
		Employee employee1 = new Employee("Sudhir", "Phate", "Mumbai", listOfDepartment.get(0));
		Employee employee2 = new Employee("Aman", "Jabreba", "Hyderabad", listOfDepartment.get(1));
		Employee employee3 = new Employee("Taimur", "Shah", "Banaras", listOfDepartment.get(2));
		Employee employee4 = new Employee("Ayushi", "Agrawal", "Jaipur", listOfDepartment.get(0));
		employee_dao.insert(employee1);
		employee_dao.insert(employee2);
		employee_dao.insert(employee3);
		employee_dao.insert(employee4);
	}
	@Test
	public void addEmployeeInDepartment()
	{
		GenericDAO<Department> department_dao = new GenericDAO<>(Department.class);
		Department department = department_dao.fetchById(1);
		department.getEmployees().add(new Employee("Tanmay", "Mehra", "Bhopal"));
		department_dao.update(department);
	}
	@Test
	public void create()
	{
		GenericDAO<CarPart> carPartDao = new GenericDAO<>(CarPart.class);
		CarPart carPart = new CarPart();
		carPart.setCarModel("Maruti Alto");
		carPart.setPartName("Steering Wheel");
		carPart.setPrice(2000);
		carPart.setQuantity(55);
		carPartDao.insert(carPart);
	}
}
