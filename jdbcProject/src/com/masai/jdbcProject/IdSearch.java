package com.masai.jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class IdSearch {
	
public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter id of employee ");
		int id = sc.nextInt();
		
		
		
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db1";
		
		
		try (Connection conn = DriverManager.getConnection(url, "root", "Root@123")) {
			 
			PreparedStatement ps = conn.prepareStatement("select * from employee where eid = ?");
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				
				System.out.println("Salary is : " + rs.getInt("salary"));
			} else {
				System.out.println("No data found");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		
	}
}
