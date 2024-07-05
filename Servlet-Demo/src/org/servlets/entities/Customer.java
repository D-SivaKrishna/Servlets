package org.servlets.entities;


public class Customer 
{
	private int id;
	private String username;
	private String password;
	
	
	
	public String getUsername() {
		return username;
	}



	



	public void setId(int id) {
		this.id = id;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}


	

	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", password=" + password + "]";
	}



	public Customer() {
		super();
	}

	


	public Customer(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}







	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	
	
	
	
}
