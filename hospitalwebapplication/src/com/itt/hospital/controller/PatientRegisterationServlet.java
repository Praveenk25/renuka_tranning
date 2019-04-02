package com.itt.hospital.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itt.hospital.model.PatientData;
import com.itt.hospital.pojo.Patient;

public class PatientRegisterationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PatientRegisterationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String patientName = request.getParameter("patientName");
		int patientAge = Integer.parseInt(request.getParameter("patientAge"));
		String patientGender = request.getParameter("patientGender");
		String disease = request.getParameter("disease");
		Patient patient = new Patient(patientName,patientAge,patientGender, disease );
		PatientData patientData = new PatientData();
		patientData.insertPatientData(patient);
		
		RequestDispatcher req = request.getRequestDispatcher("/patientadded.jsp");
		req.forward(request, response);
		
	}

}
