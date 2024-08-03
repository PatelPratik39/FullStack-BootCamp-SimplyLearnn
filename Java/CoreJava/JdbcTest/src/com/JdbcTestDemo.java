package com;

import java.sql.*;

public class JdbcTestDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root","Pratik39");
			System.out.println("Connection Succesfull!!");
			Statement stmt = connection.createStatement();
			
			int result = stmt.executeUpdate("insert into employee values(6,'Chandu Champion',65000)");
			
			if(result > 0) {
				System.out.println("Record inserted successfully!!");
			}
			stmt.close();
			connection.close();
		}catch(Exception e) {
			System.err.println(e);
		}

	}

}
