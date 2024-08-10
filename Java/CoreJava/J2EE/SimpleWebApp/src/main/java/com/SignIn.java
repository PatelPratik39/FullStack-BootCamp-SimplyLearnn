package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public SignIn() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("emailid");  // receiving text field value
		String password = request.getParameter("password");
		if(emailid.equals("xyz@gmail.com") && password.equals("123")) {
			pw.print("Successfuly login with get");
		}else {
			pw.println("failure try once again with get");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("emailid");  // receiving text field value
		String password = request.getParameter("password");
		if(emailid.equals("xyz@gmail.com") && password.equals("123")) {
			pw.print("Successfuly login with get");
		}else {
			pw.println("failure try once again with get");
		}
	}

}
