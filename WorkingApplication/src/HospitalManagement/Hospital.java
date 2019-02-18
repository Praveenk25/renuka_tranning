package HospitalManagement;

import java.util.*;
import java.util.List;

class Hospital {

	List<Doctor> doctorList = new ArrayList<Doctor>();
	List<Patient> patientList = new ArrayList<Patient>();

	String hospitalName;

	void addDoctor(Doctor d1) {
		doctorList.add(d1);

	}

	void addPatient(Patient p) {
		patientList.add(p);

	}

	Hospital(String name) {
		this.hospitalName = name;
	}

	public List<Doctor> showDoctors() {
		return doctorList;
	}

	public List<Patient> showPatients() {
		return patientList;
	}
}
