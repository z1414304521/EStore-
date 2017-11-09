package com.briup.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
  public static Connection   getConnection(){
	  Connection   conn=null;
	  try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "lzlg";
		String password ="lzlg";
		//Connection java.sql.DriverManager.getConnection(String url, String user, String password) throws SQLException
	     conn= DriverManager.getConnection(url, user, password);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return  conn;
		
  }
}
