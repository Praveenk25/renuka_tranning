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
			preparedStatement = con.prepareStatement("insert into Doctor(doctorName,doctorSpeciality) values(?,?)");
			preparedStatement.setString(1, doctorName);
			preparedStatement.setString(2, doctorSpeciality);

			preparedStatement.executeUpdate();

		} catch (ClassNotFoundException ce) {
			System.out.println("Class Not Found");

		} catch (SQLException se) {
			System.out.println(se.getMessage());
			System.out.println("SQL exception occurred");

		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException se) {
				System.out.println("SQL exception occurred");

			}

		}

	}

	public void showDoctor() {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DatabaseConnection.initializeDatabase();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from Doctor");
			if (rs != null) {
				while (rs.next()) {
					System.out.println("\n doctorId " + rs.getInt(1) + "\n doctorName " + rs.getString(2)
							+ "\n doctorSpeciality " + rs.getString(3));
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
