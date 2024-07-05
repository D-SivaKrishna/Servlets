package org.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.servlet.databaseconnectivity_jdbc.DatabaseConnect;
import org.servlets.entities.Customer;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/login")
public class MyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	private static DatabaseConnect db;
//	private static Customer c;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    
    @Override
    public void init() throws ServletException {
    	super.init();
    	
    	 db=new DatabaseConnect();
//    	 c=new Customer();
    }
    
    
    
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		  Customer customer = new Customer(username, password);
		  
		db.insert(customer);
		
		PrintWriter writer = response.getWriter();
		writer.print("Successfully inserted....!!!!");
		
	}

}
