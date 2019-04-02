package com.itt.hospital.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itt.hospital.model.DoctorData;

public class ViewDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ViewDoctorServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DoctorData doctorData = new DoctorData();
		ResultSet rs=doctorData.showDoctor();
		request.setAttribute("rs", rs);
		RequestDispatcher req = request.getRequestDispatcher("/viewdoctor.jsp");
		req.forward(request, response);
	}

}
