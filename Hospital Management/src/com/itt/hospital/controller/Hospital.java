package com.itt.hospital.controller;

import hospitalEmployees.EmployeeData;

import hospitalManagement.DoctorData;

import java.sql.*;

public class Hospital {

	String hospitalName;

	public Hospital(String name) {
		this.hospitalName = name;
	}

	DoctorData doctorData = new DoctorData();
	PatientData pd = new PatientData();
	EmployeeData ed = new EmployeeData();

	public void addDoctors(String doctorName, String doctorSpeciality) throws ClassNotFoundException, SQLException {
		doctorData.addDoctor(doctorName, doctorSpeciality);

	}

	public void showDoctors() {
		doctorData.showDoctor();
	}

	public void addPatient() {
		pd.insertPatientData();

	}

	public void showPatients() {
		pd.showPatientData();
	}

	public void addEmployee() {
		ed.insertEmployeeData();

	}

}
