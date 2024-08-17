package com.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pms.bean.Product;
import com.pms.resource.DbResource;

public class ProductDao {
	
	public int storeProduct(Product product) {
		try {
			Connection connection = DbResource.getDbConnection();
			PreparedStatement pstmt = connection.prepareStatement("insert into product values(?,?,?)");
			pstmt.setInt(1,  product.getPid());
			pstmt.setString(2, product.getPname());
			pstmt.setFloat(3, product.getPrice());
			return pstmt.executeUpdate();
			
		}catch(Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
//	public int updateProduct(Product product) {
//		try {
//			Connection con = DbResource.getDbConnection();
//			PreparedStatement pstmt = con.prepareStatement("update product set price = ? where pid=?");
//			pstmt.setFloat(1, product.getPrice());
//			pstmt.setInt(2, product.getPid());
//			return pstmt.executeUpdate();
//		} catch (Exception e) {
//			System.err.println(e);
//			return 0;
//		}
//	}
	
	public int updateProduct(Product product) {
		try {
			Connection connection = DbResource.getDbConnection();
			PreparedStatement pstmt = connection.prepareStatement("update product set price = ? where pid = ? ");
			pstmt.setInt(2,  product.getPid());
			pstmt.setFloat(1, product.getPrice());
			return pstmt.executeUpdate();
			
		}catch(Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public int deleteProduct(int pid) {
		try {
			Connection connection = DbResource.getDbConnection();
			PreparedStatement pstmt = connection.prepareStatement("delete from product where pid= ?");
			pstmt.setInt(1, pid);
			return pstmt.executeUpdate();
			
		}catch(Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	

}
