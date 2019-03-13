package com.itt.hospital.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itt.hospital.pojo.LoginBean;
import com.itt.hospital.pojo.LoginDatabase;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		LoginBean loginBean = new LoginBean();

		loginBean.setUserName(userName);
		loginBean.setPassword(password);

		LoginDatabase loginDaatabase = new LoginDatabase();

		try {
			String userValidate = loginDaatabase.authenticateUser(loginBean);
			if (userValidate.equals("Admin_Role")) {
				System.out.println("Admin's Home");
				HttpSession session = request.getSession(); 
				session.setAttribute("Admin", userName); 
				request.setAttribute("userName", userName);
				request.getRequestDispatcher("/Admin.jsp").forward(request, response);
			} else if (userValidate.equals("User_Role")) {
				System.out.println("User's Home");
				HttpSession session = request.getSession();
				session.setAttribute("User", userName);
				request.setAttribute("userName", userName);
				request.getRequestDispatcher("/User.jsp").forward(request, response);
			} else {
				System.out.println("Error message = " + userValidate);
				request.setAttribute("errMessage", userValidate);
				request.getRequestDispatcher("/Login.jsp").forward(request, response);
			}
		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}
