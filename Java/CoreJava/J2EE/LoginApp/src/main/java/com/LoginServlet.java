package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter pw = response.getWriter();
			String emailid = request.getParameter("emailid");
			String password = request.getParameter("password");
			
			RequestDispatcher rd1 = request.getRequestDispatcher("Home");
			RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
			
			response.setContentType("text/html");
			StringBuffer sb = new StringBuffer(password);
			password = sb.reverse().toString();  // convert password in reverse order. 
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "Pratik39");
			PreparedStatement pstmt = con.prepareStatement("select * from login where emailid=? and password=?");
			pstmt.setString(1, emailid);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				request.setAttribute("user", emailid);
				rd1.forward(request, response);
			}else {
				pw.println("Failure try once again!");
				rd2.include(request, response);
			}
			} catch (Exception e) {
				pw.print(e.getMessage());
				rd2.include(request, response);
			}
		}

}
