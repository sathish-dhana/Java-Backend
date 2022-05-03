package com.Question1.DBservice;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;

import com.Question1.Beans.Employee;
import com.Question1.DButil.MyEntityManagerFactory;
import com.Question1.Exception.EmployeeException;

@Service
public class EmployeeService implements EmployeeServiceInterface  {
	
	@Override
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		EntityManager entityManager = MyEntityManagerFactory.provideEntityManager();
		
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(emp);
			entityManager.getTransaction().commit();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
		
		entityManager.close();
		
		return emp;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> li = null;
		
		EntityManager entityManager = MyEntityManagerFactory.provideEntityManager();
		
		TypedQuery<Employee> listOfEmp = entityManager.createQuery("select a from Employee a", Employee.class);
		
		li = listOfEmp.getResultList();
		
		entityManager.close();
		
		return li;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		
		Employee employee = null;
		
		EntityManager entityManager = MyEntityManagerFactory.provideEntityManager();
		
		employee = entityManager.find(Employee.class, empId);
		
		entityManager.close();
		
		return employee;
	}

	@Override
	public String deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		String res = "Deleted";
		
		EntityManager entityManager = MyEntityManagerFactory.provideEntityManager();
		
		Employee employee = entityManager.find(Employee.class, empId);
		
		try {
			
			entityManager.getTransaction().begin();
			entityManager.remove(employee);
			entityManager.getTransaction().commit();
			
		}catch (Exception e) {
			res = "Not Deleted ";
			System.out.println(e.getMessage());
		}
		
		entityManager.close();
		
		return res;
	}

}
