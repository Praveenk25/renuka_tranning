package com.itt.hospital.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itt.hospital.persistence.UserDetails;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fullname = request.getParameter("full_name");

		String email = request.getParameter("email");

		String username = request.getParameter("username");

		String password = request.getParameter("password");

		String role = request.getParameter("role");

		UserDetails userDetails = new UserDetails();
		userDetails.addUserDeatils(fullname, email, username, password, role);

		RequestDispatcher req = request.getRequestDispatcher("/register1.jsp");
		req.forward(request, response);

	}

}
