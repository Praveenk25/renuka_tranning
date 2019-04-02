package com.itt.hospital.service;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.sql.*;
import java.util.Properties;

public class DatabaseConnection {
	
	static Connection con = null;
	
	static String dbDriver;
	
	static String dbUrl;
	
	static String dbName;
	
	static String dbUsername;
	
	static String dbPassword;
	

	public static void connectionDetails() {
		
		Properties properties = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream(
					"E:\\workspace\\Project\\renuka_tranning\\hospitalwebapplication\\WebContent\\WEB-INF\\configure\\configuration.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dbDriver = properties.getProperty("dbdriver");
		dbUrl = properties.getProperty("dburl");
		dbName = properties.getProperty("dbname");
		dbUsername = properties.getProperty("dbusername");
		dbPassword = properties.getProperty("dbpassword");

	}

	private static Connection initializeDatabase(String Driver, String URL, String Name, String Username,
			String Password) throws SQLException, ClassNotFoundException {
		DatabaseConnection.connectionDetails();
		Class.forName(dbDriver);
		con = DriverManager.getConnection(dbUrl + dbName, dbUsername, dbPassword);
		return con;

	}

	public static Connection initializeDatabase() throws ClassNotFoundException, SQLException {
		if (con != null) {
			return con;
		}
		con = initializeDatabase(dbDriver, dbUrl, dbName, dbUsername, dbPassword);
		return con;
	}

	public static void closeConnection() {
		try {
							
			if (con != null) {
				con.close();
				con = null;
			}
		} catch (SQLException se) {
			System.out.println("SQL exception occurred");
		}

	}

}
