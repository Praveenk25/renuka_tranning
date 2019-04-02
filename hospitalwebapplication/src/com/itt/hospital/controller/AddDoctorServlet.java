package com.itt.hospital.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itt.hospital.model.DoctorData;

public class AddDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public AddDoctorServlet() {
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String doctorname = request.getParameter("doctorname");

		String doctorspeciality = request.getParameter("doctorspeciality");
		
		DoctorData doctorData = new DoctorData();
		
		doctorData.addDoctor( doctorname, doctorspeciality);
		

		RequestDispatcher req = request.getRequestDispatcher("/added.jsp");
		req.forward(request, response);
	}

}
