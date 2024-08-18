package com.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBResource {
	
	public static Connection getDbConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "Pratik39");
			return connection;
		} catch(Exception e) {
			System.err.println(e);
		}
		return null;
	}

}
