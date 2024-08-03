package com;

import java.sql.*;

public class JdbcTestDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root","Pratik39");
			System.out.println("Connection Succesfull!!");
		}catch(Exception e) {
			System.err.println(e);
		}

	}

}
