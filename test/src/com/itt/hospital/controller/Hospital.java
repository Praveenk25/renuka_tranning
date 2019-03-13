package com.itt.hospital.controller;

import java.sql.*;

import com.itt.hospital.model.DoctorData;
import com.itt.hospital.model.EmployeeData;
import com.itt.hospital.model.PatientData;
import com.itt.hospital.pojo.Employee;
import com.itt.hospital.pojo.Patient;

public class Hospital {

	String hospitalName;

	public Hospital(String name) {
		this.hospitalName = name;
	}

	DoctorData doctorData = new DoctorData();
	PatientData patientData = new PatientData();
	EmployeeData employeeData = new EmployeeData();

	public void addDoctors( String doctorname, String doctorspeciality)
			throws ClassNotFoundException, SQLException {
		doctorData.addDoctor( doctorname, doctorspeciality);

	}

	public void showDoctors() {
		doctorData.showDoctor();
	}

	public void addPatient(Patient patient) {
		patientData.insertPatientData(patient);

	}

	public void showPatients() {
		patientData.showPatientData();
	}

	public void addEmployee(Employee employee) {
		employeeData.insertEmployeeData(employee);

	}

	public void showEmployees() {
		employeeData.showEmployeeData();
	}

}
