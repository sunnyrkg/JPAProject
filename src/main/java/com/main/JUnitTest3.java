package com.main;

import org.junit.*;

import com.entity.Department;
import com.entity.Employee;

public class JUnitTest3 {
	@Test
	public void testCriteriaQuery()
	{
		Department.getDAO().fetchAllEmployee().forEach((employee)->{
			System.out.print(employee.getFirstName()+" "+employee.getLastName()+"----");
			System.out.println(employee.getDepartment().getDepartmentName());
		});
	}
	@Test
	public void testPartialSelection()
	{
		Employee.getDAO().fetchEmployeesPartialDetails("d").forEach((object)->
				{
					System.out.println(object[0]);
					System.out.println(((Department)object[1]).getDepartmentName());
				});
	}
	@Test
	public void testWhereClause()
	{
		Employee.getDAO().fetchEmployeeBySalary(3).forEach((object)->
		{
			System.out.print("\t"+object.getUid());
			System.out.print("\t"+object.getDepartment().getDepartmentName());
			System.out.println("\t"+object.getFirstName());
		});
	}
	@Test
	public void testWhereAndCondition()
	{
		Employee.getDAO().fetchEmployeeByNameAndUid(3, "A%").forEach((object)->
		{
			System.out.print("\t"+object.getUid());
			System.out.print("\t"+object.getDepartment().getDepartmentName());
			System.out.println("\t"+object.getFirstName());
		});
	}
	@Test
	public void testWhereAndJoin()
	{
		Employee.getDAO().fetchEmployeeByDepartmentName("InfoTech").forEach((object)->
		{
			System.out.print("\t"+object.getUid());
			System.out.print("\t"+object.getDepartment().getDepartmentName());
			System.out.println("\t"+object.getFirstName());
		});
	}
}
