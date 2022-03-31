package com.masai.useCases;

import java.util.List;

import com.masai.Excepions.EmployeeException;
import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class Main {
	public static void main(String[] args) {
		
		EmployeeDao emp = new EmployeeDaoImpl();
		
		Employee emp1;
		try {
			emp1 = emp.getEmployeeById(9);
			System.out.println(emp1.toString());
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		List<Employee> li = emp.getAllEmployee();
		
		li.forEach(x -> System.out.println(x.toString()));
		
		
		
	}
}
