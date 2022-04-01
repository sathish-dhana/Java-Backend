package com.masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Employee;
import com.masai.exception.EmployeeException;
import com.masai.util.DBconnection;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String saveEmployeeDetails(Employee employee) {
		
		String empl = "Not added";
		
		Connection conn = DBconnection.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("insert into Employee values(?, ?, ?, ?)");
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());
			
			int x = ps.executeUpdate();
			
			if (x > 0) {
				empl = "Employee details added succesfully";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
		return empl;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee empl = null;
		
		Connection conn = DBconnection.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from Employee where empId = ?");
			ps.setInt(1, empId);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				empl = new Employee(rs.getInt("empId"), rs.getString("name"),
						  rs.getString("address"), rs.getInt("salary"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException("Enter proper Id");
		}
		
		return empl;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> empl = new ArrayList<Employee>();
		
		Connection conn = DBconnection.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from Employee");
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
			  empl.add(new Employee(rs.getInt("empId"), rs.getString("name"),
					  rs.getString("address"), rs.getInt("salary")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		return empl;
	}

	@Override
	public String deleteEmployee(int empId) throws EmployeeException {
		
		String empl = "Not deleted";
		
		Connection conn = DBconnection.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("delete from Employee where empId = ?");
			ps.setInt(1, empId);
			
			int x = ps.executeUpdate();
			
			if (x > 0) {
				empl = "Employee details deleted succesfully";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException("Enter proper Id");
		}
		
		
		
		return empl;
	}
	
}
