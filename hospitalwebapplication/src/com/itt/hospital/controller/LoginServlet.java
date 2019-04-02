package com.itt.hospital.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.itt.hospital.bean.LoginBean;
import com.itt.hospital.persistence.UserAuthentication;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");

		String password = request.getParameter("password");

		LoginBean loginBean = new LoginBean();

		loginBean.setUserName(username);

		loginBean.setPassword(password);

		UserAuthentication userAuthenticate = new UserAuthentication();

		try {
			String userValidate = userAuthenticate.authenticateUser(loginBean);

			if (userValidate.equals("Admin_Role")) {

				System.out.println("Admin's Home");

				HttpSession session = request.getSession();

				session.setAttribute("Admin", username);

				request.setAttribute("username", username);

				request.getRequestDispatcher("/admin.jsp").forward(request, response);

			} else if (userValidate.equals("User_Role")) {

				System.out.println("User's Home");

				HttpSession session = request.getSession();

				session.setAttribute("User", username);

				request.setAttribute("username", username);

				request.getRequestDispatcher("/user.jsp").forward(request, response);

			} else {
				System.out.println("Error message = " + userValidate);

				request.setAttribute("errMessage", userValidate);

				request.getRequestDispatcher("/login.jsp").forward(request, response);

			}

		} catch (IOException io) {

			io.printStackTrace();

		} catch (SQLException se) {

			se.printStackTrace();

		}
	}
	
}
