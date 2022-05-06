package com.masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.masai.Bean.Employee;
import com.masai.Exception.EmployeeException;
import com.masai.util.DbUtil;
import com.mysql.cj.xdevapi.Result;

public class EmployeeDAO implements EmployeeDao {
	
	
	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee emp = null; 
		
		try (Connection con = DbUtil.getConnection()) {
			
			PreparedStatement ps = con.prepareStatement("select * from Employee where empId = ?");
			ps.setInt(1, empId);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				emp = new Employee(rs.getInt("empId"), rs.getString("name"), 
						rs.getString("address"), rs.getInt("salary"));
			} else {
				throw new EmployeeException("not found");
			}
				
		} catch (Exception e) {
			
		}
		
		
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String giveBonusToEmployee(int empId, int amount) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
