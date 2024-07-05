package org.servlet.databaseconnectivity_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.servlets.entities.Customer;

public class DatabaseConnect 
{
	static Connection con=null;
	static PreparedStatement pstmt=null;
	
	final static String url="jdbc:mysql://localhost:3306/hospital";
	final static String us="root";
	final static String pwd="admin";
	
//	private static Customer c;
	final static String query="insert into login (username,password)values(?,?)";
	
	public DatabaseConnect() {
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");

			con=DriverManager.getConnection(url,us,pwd);
			
		} catch (SQLException | ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insert(Customer customer)
	{
		   if (customer == null) {
	            throw new IllegalArgumentException("Customer object cannot be null");
	        }
		try {
			new DatabaseConnect();
			pstmt=con.prepareStatement(query);
			
//			pstmt.setInt(1, c.getId());
			pstmt.setString(1,customer.getUsername());
			pstmt.setString(2,customer.getPassword());
			
			int result = pstmt.executeUpdate();
			System.out.println(result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
