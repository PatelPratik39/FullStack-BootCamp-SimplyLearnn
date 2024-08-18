package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoTest
 */
@WebServlet("/DemoTest")
public class DemoTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    int count = 0;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession hs = request.getSession();
		response.setContentType("text/html");
		pw.println("<h3>");
		pw.println("<br/> Count Value = " + count);
		pw.println("<br/> Session Id = " + hs.getId());
		
		if(hs.isNew()) {
			pw.println("<br/> New Client");
		} else {
			pw.println("<br/> Old Client");
		}
		pw.println("<br/>Session creation time = "+hs.getCreationTime());  // millisecond format.
		pw.println("<br/>Session creation time = "+new Date(hs.getCreationTime()));// date format
		pw.println("<br/>Session last access time = "+new Date(hs.getLastAccessedTime()));// date format
		pw.println("<br/>session default time = "+hs.getMaxInactiveInterval());
		hs.setMaxInactiveInterval(600);
		pw.println("<br/>session set custom time = "+hs.getMaxInactiveInterval());
		
		if(count%5==0) {
			hs.invalidate();
		}
		count++;
		pw.println("<br/></h3>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
