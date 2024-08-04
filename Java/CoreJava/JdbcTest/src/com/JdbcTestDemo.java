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
			/*
			 * Insert Query
			 */
			
//			int result = stmt.executeUpdate("insert into employee values(7,'Raman Ganga',15000)");
//			
//			if(result > 0) {
//				System.out.println("Record inserted successfully!!");
//			}
			
//			/*
//			 * Delete Query
//			 */
//			
//			int result = stmt.executeUpdate("delete from employee where id = 2");
//			if(result > 0) {
//				System.out.println("Record Deleted Successfully");
//			} else {
//				System.out.println("Record Not Present!!");
//			}
			
			
			/*
			 * Update Query
			 */
			
//			int result = stmt.executeUpdate("Update employee set salary= 35000 where id = 7");
//			if(result > 0) {
//				System.out.println("Record Updated Successfully");
//			} else {
//				System.out.println("Record Not Present!!");
//			}
//			
			/*
			 * RETREIVE QUERY
			 */
			
			ResultSet rs = stmt.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println("id is " + rs.getInt(1) + " name is " + rs.getString(3) + " Salary "+ rs.getFloat(3));
			}
			rs.close();
			stmt.close(); 
			
			connection.close();
			
		}catch(Exception e) {
			System.err.println(e);
		}

	}

}
