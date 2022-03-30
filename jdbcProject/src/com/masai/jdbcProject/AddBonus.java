package com.masai.jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddBonus {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db1";
		
		
		try(Connection con = DriverManager.getConnection(url, "root", "Root@123")) {
			
			PreparedStatement ps = con.prepareStatement("update employee set salary = salary + 500");
			
			int rs = ps.executeUpdate();
			
			if (rs > 0) {
				System.out.println("Bonus Added");
			} else {
				System.out.println("Not added");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
