package com;

import java.sql.*;
import java.util.Scanner;

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
			
//			ResultSet rs = stmt.executeQuery("select * from employee");
//			while(rs.next()) {
//				System.out.println("id is " + rs.getInt(1) + " name is " + rs.getString(3) + " Salary "+ rs.getFloat(3));
//			}
//			rs.close();
//			stmt.close(); 
			
//			Scanner sc = new Scanner(System.in);
//			// insert record using PreparedStatement 
//			PreparedStatement pstmt = connection.prepareStatement("insert into employee values(?,?,?)");
//			System.out.println("Enter the id");
//			int id  = sc.nextInt();
//				pstmt.setInt(1, id);
//			
//			System.out.println("Enter the name");
//			String name= sc.next();
//				pstmt.setString(2, name);
//			
//			System.out.println("Enter the salary");
//			float salary  = sc.nextFloat();
//				pstmt.setFloat(3, salary);
//			
//			int result = pstmt.executeUpdate();
			
			
//			Scanner sc = new Scanner(System.in);
			// delete record using PreparedStatement 
//			PreparedStatement pstmt = connection.prepareStatement("delete from employee where id = ?");
//			System.out.println("Enter the id");
//			int id  = sc.nextInt();
//				pstmt.setInt(1, id);
			
//			System.out.println("Enter the name");
//			String name= sc.next();
//				pstmt.setString(2, name);
//			
//			System.out.println("Enter the salary");
//			float salary  = sc.nextFloat();
//				pstmt.setFloat(3, salary);
			
			
			Scanner sc = new Scanner(System.in);
			// Update record using PreparedStatement 
//			PreparedStatement pstmt = connection.prepareStatement("Update employee set salary =? where id =?");
//			System.out.println("Enter the id");
//			int id  = sc.nextInt();
////				pstmt.setInt(1, id);
//			
//			System.out.println("Update the salary");
//			float salary  = sc.nextFloat();
//			
//			pstmt.setFloat(1, salary);
//			pstmt.setInt(2, id);
//			
//			int result = pstmt.executeUpdate();
//			
//			if(result>0) {
//				System.out.println("Record Updated...");
//			}
			
			//Retrieve with prepared statement with condition
			
			PreparedStatement pstmt = connection.prepareStatement("select * from employee where salary  > ?");
			System.out.println("Please Enter the Salary ");
			float salary = sc.nextFloat();
			pstmt.setFloat(1, salary);
			
			ResultSet resultSet = pstmt.executeQuery();
			
			while(resultSet.next()) {
				System.out.println("id is "+resultSet.getInt(1)+" Name is "+resultSet.getString(2)+" Salary is "+resultSet.getFloat(3));
			}
			resultSet.close();
			pstmt.close();
			
			connection.close();
			} catch (Exception e) {
				System.err.println(e);
			}

	}

}
