package com.itt.hospital.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itt.hospital.bean.LoginBean;
import com.itt.hospital.constants.Constants;
import com.itt.hospital.service.DatabaseConnection;

public class UserAuthentication {

	public String authenticateUser(LoginBean loginBean) throws SQLException {

		String userName = loginBean.getUserName();

		String password = loginBean.getPassword();

		Connection con = null;

		Statement statement = null;

		ResultSet resultSet = null;

		String userNameDb = "";

		String passwordDb = "";

		String roleDb = "";

		try {

			con = DatabaseConnection.initializeDatabase();

			statement = con.createStatement();

			resultSet = statement.executeQuery(Constants.SELECT_QUERY);

			while (resultSet.next()) {

				userNameDb = resultSet.getString(Constants.USERNAME);

				passwordDb = resultSet.getString(Constants.PASSWORD);

				roleDb = resultSet.getString(Constants.ROLE);

				if (userName.equals(userNameDb) && password.equals(passwordDb) && roleDb.equals(Constants.ADMIN))
					return Constants.ADMIN_ROLE;

				else if (userName.equals(userNameDb) && password.equals(passwordDb) && roleDb.equals(Constants.USER))
					return Constants.USER_ROLE;
			}

		} catch (SQLException se) {

			System.out.println(Constants.SQLStatement);

		} catch (ClassNotFoundException e) {

			System.out.println(Constants.CLASSNOTFOUND_Statement);

		} finally {
			if (statement != null) {
				statement.close();
				statement = null;
			}
			if (resultSet != null) {
				resultSet.close();
				resultSet = null;
			}

			DatabaseConnection.closeConnection();
		}

		return Constants.INVALID;
	}
}