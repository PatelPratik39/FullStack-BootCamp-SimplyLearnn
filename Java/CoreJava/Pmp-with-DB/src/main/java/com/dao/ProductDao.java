package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.Product;

public class ProductDao {
	String url = "jdbc:mysql://localhost:3306/my_db?serverTimezone=America/Chicago";
    String user = "root";
    String password = "Pratik39";
    
    public int storeProduct(Product product) {  
        // Use try-with-resources to ensure resources are closed
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = connection.prepareStatement("INSERT INTO product (pid, pname, price) VALUES (?, ?, ?)")) {
             
            // Set the parameters
            pstmt.setInt(1, product.getPid());
            pstmt.setString(2, product.getpName());
            pstmt.setFloat(3, product.getPrice());
            
            // Execute the update
            return pstmt.executeUpdate();
            
        } catch (SQLException e) {
            // Log the exception with a proper logger or print the stack trace for more detail
            e.printStackTrace();
            return 0;
        }
    }
    
    public int updateProduct(Product product) {
    	try {
    		
    	}catch (Exception e) {
            // Log the exception with a proper logger or print the stack trace for more detail
            e.printStackTrace();
            return 0;
    	}
		return 0;
    }
}
