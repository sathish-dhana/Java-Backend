package com.masai.jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDetails {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db1";
		
		
		try(Connection con = DriverManager.getConnection(url, "root", "Root@123")) {
			
			PreparedStatement ps = con.prepareStatement("select * from employee");
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				System.out.println("emp Id : " + rs.getInt("eid"));
				System.out.println("Name : " + rs.getString("name"));
				System.out.println("Address : " + rs.getString("address"));
				System.out.println("salary : " + rs.getInt("salary"));
				
				System.out.println("--------------------------");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
