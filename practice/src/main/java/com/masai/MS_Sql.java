package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MS_Sql implements Database {

	
	private String url;
	private String username;
	private String password;
	
	
	
	public void setUrl(String url) {
		this.url = url;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public void setPassword(String password) {
		this.password = password;
	}


   @Override
	public String getconnection() {
		
		return "Hi from MS_SQL '"+url+"' ";
	}

		

	

}
