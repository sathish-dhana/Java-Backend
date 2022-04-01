package com.masai.Check;

import java.util.List;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.bean.Employee;
import com.masai.exception.EmployeeException;

public class Main {
	public static void main(String[] args) {
		
		
		EmployeeDao emp = new EmployeeDaoImpl();
		
////		String res = emp.saveEmployeeDetails(new Employee(8, "neo1", "delhi2", 10200000));
////		System.out.println(res);
//		
////		String del;
////		try {
////			del = emp.deleteEmployee(7);
////			System.out.println(del);
////		} catch (EmployeeException e) {
////			// TODO Auto-generated catch block
////			System.out.println(e.getMessage());
////		}
//		
//		
////		List<Employee> li = emp.getAllEmployees();
////		li.forEach(x -> System.out.println(x.toString()));
////		
		
		Employee li;
		try {
			li = emp.getEmployeeById(1);
			System.out.println(li.toString());
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
}
