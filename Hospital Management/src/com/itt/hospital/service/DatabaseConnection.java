package com.itt.hospital.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;

public class DatabaseConnection {
	static Connection con = null;
	{ int ch; 
	  
     // check if File exists or not 
     FileReader fr=null; 
     try
     { 
         fr = new FileReader("text"); 
     } 
     catch (FileNotFoundException fe) 
     { 
         System.out.println("File not found"); 
     } 
     while ((ch=fr.read())!=-1) {
	private static Connection initializeDatabase(String Driver, String URL, String Name, String Username,
			String Password) throws SQLException, ClassNotFoundException {
		
		Class.forName(dbDriver);
		con = DriverManager.getConnection(dbURL + dbName, dbUsername, dbPassword);
		return con;

	}
     }
	}

	public static Connection initializeDatabase() throws ClassNotFoundException, SQLException {
		if (con != null) {
			return con;
		}
		return con=initializeDatabase(dbDriver, dbURL, dbName, dbUsername, dbPassword);
	}
	public static void closeConnection() {
		try { if(con!=null) {
			con.close();
			con=null;
		}
		}
		catch(SQLException se) {
			System.out.println("SQL exception occurred");
		}
	
		
	}
	
	
}
