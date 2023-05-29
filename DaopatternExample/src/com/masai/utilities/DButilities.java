package com.masai.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DButilities {

static String username;
static String password;
static String url;

static {
	ResourceBundle bundel=ResourceBundle.getBundle("dbdetails");
	username=bundel.getString("USERNAME");
	password=bundel.getString("PASSWORD");
	url=bundel.getString("URL");
}
	
	// public static void main(String[] args) {
//		System.out.println(url);
//		System.out.println(password);
//		System.out.println(username);
//		
//	}
	
	
	public static Connection createconnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
	
	public static boolean isResultSetEmpty(ResultSet resultSet) throws SQLException{
		return (!resultSet.isBeforeFirst() && resultSet.getRow() == 0);
	}
	
}
