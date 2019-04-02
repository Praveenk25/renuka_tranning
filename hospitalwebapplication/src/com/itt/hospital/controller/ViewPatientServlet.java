package com.itt.hospital.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itt.hospital.model.PatientData;

public class ViewPatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ViewPatientServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PatientData patientData = new PatientData();
		List list = patientData.showPatientData();
		request.setAttribute("list",list);
		RequestDispatcher req = request.getRequestDispatcher("/viewpatient.jsp");
		req.forward(request, response);
		
	}

}
