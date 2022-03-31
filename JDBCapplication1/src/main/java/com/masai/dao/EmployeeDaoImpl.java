package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.Excepions.EmployeeException;
import com.masai.bean.Employee;
import com.masai.util.DButility;

public class EmployeeDaoImpl implements EmployeeDao {

	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee emp = null;
		
		Connection con = DButility.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from Employee where empId = ?");
			
			ps.setInt(1, empId);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				emp = new Employee(rs.getInt("empId"), rs.getString("name"), 
						rs.getString("address"), rs.getInt("salary"));
							
			} else {
				throw new EmployeeException("No employee found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException("No employee found");
		}
		
		
		return emp;
	}

	public List<Employee> getAllEmployee() {
		List<Employee> emp = new ArrayList();
		
		Connection con = DButility.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from Employee");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Employee emp1 = new Employee(rs.getInt("empId"), rs.getString("name"), 
						rs.getString("address"), rs.getInt("salary"));
				emp.add(emp1);	
			} 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		return emp;
	}

	public String saveEmployeeDetails(Employee employee) {
		String str = "Not inserted";
		
		Connection con = DButility.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement("insert into Employee values(?, ?, ?, ?)");
			
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());
			
			int x = ps.executeUpdate();
			
			if (x > 0) {
				str = "Employee details added";
							
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		return str;
	}

	public boolean deleteEmployeeById(int empId) {
		boolean delete = false;
		
		Connection con = DButility.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement("delete from Employee where empId = ?");
			
			ps.setInt(1, empId);
			
			int x = ps.executeUpdate();
			
			if (x > 0) {
				delete = true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		return delete;
	}

	public String giveBonusToEmployee(int empId, int amount) {
		String str = "Not provided";
		
		Connection con = DButility.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement("update Employee set salary = salary + ? where empId = ?");
			
			ps.setInt(1, amount);
			ps.setInt(2, empId);
			
			int x = ps.executeUpdate();
			
			if (x > 0) {
				str = "Employee details added";
							
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		return str;
	}

}
