package com.itt.hospital.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itt.hospital.service.DatabaseConnection;

public class DoctorData {
	Connection con = null;
	PreparedStatement preparedStatement = null;

	public void addDoctor(String doctorName, String doctorSpeciality) {
		try {
			con = DatabaseConnection.initializeDatabase();
			preparedStatement = con.prepareStatement("insert into Doctor values(?,?)");
			preparedStatement.setString(1, doctorName);
			preparedStatement.setString(2, doctorSpeciality);
			preparedStatement.executeUpdate();

		} catch (ClassNotFoundException ce) {
			System.out.println("Class Not Found");

		} catch (SQLException se) {
			System.out.println("SQL exception occurred");

		} finally {
			try {
				preparedStatement.close();
			} catch (SQLException se) {
				System.out.println("SQL exception occurred");

			}
		}

	}

	public void showDoctor() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DatabaseConnection.initializeDatabase();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from Doctor");
			if(rs != null) {
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2));
			}
			}
			rs.close();
		} catch (ClassNotFoundException ce) {
			System.out.println("Class Not Found");

		} catch (SQLException se) {
			System.out.println(se.getMessage());

		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException se) {
					System.out.println("SQL exception occurred when trying to close the resultSet object");

				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException se) {
					System.out.println("SQL exception occurred when trying to close the statement object");

				}
			}
		}

	}

}
