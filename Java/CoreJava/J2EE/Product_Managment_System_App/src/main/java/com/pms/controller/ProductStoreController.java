package com.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pms.bean.Product;
import com.pms.service.ProductService;

/**
 * Servlet implementation class ProductStoreController
 */
@WebServlet("/ProductStoreController")
public class ProductStoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductStoreController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
	
		
		int pid = Integer.parseInt(request.getParameter("pid"));  //convert string to int
		String pname = request.getParameter("pname");
		float price = Float.parseFloat(request.getParameter("price"));  //convert String value to float value
		
//		create Product java bean class object
		Product p = new Product(pid, pname, price);
		
//		create Service class object
		ProductService ps = new ProductService();
		
//		pass the object and get result
		String result = ps.storeProduct(p);
		System.out.println(result);
		pw.print(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("add_product.jsp"); // set the content in html format. 
		
		response.setContentType("text/html");
		rd.include(request, response);
		
	}

}
