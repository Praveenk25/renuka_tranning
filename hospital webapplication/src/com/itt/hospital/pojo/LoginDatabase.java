package com.itt.hospital.pojo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itt.hospital.service.DatabaseConnection;

public class LoginDatabase {

	public String authenticateUser(LoginBean loginBean) {
		String userName = loginBean.getUserName();
		String password = loginBean.getPassword();

		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;

		String userNameDB = "";
		String passwordDB = "";
		String roleDB = "";

		try {
			con = DatabaseConnection.initializeDatabase();
			statement = con.createStatement();
			resultSet = statement.executeQuery("select USERNAME,PASSWORD,ROLE from Loginusers");

			while (resultSet.next()) {
				userNameDB = resultSet.getString("USERNAME");
				passwordDB = resultSet.getString("PASSWORD");
				roleDB = resultSet.getString("ROLE");
				if (userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("Admin"))
					return "Admin_Role";
				else if (userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("User"))
					return "User_Role";
			}
		} catch (SQLException se) {
			System.out.println("SQLException occurred");
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}
		return "Invalid user credentials";
	}
}