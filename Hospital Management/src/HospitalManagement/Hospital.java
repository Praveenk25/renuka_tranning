package HospitalManagement;

import java.util.*;

class Hospital implements Comparator<Doctor> {

	List<Doctor> doctorList = new ArrayList<Doctor>();
	List<Patient> patientList = new ArrayList<Patient>();
	Map<Doctor, Patient> doctorPatientList = new HashMap<Doctor, Patient>();
	String hospitalName;

	Hospital(String name) {
		this.hospitalName = name;
	}

	public void addPatientsToDoctor(Doctor d, Patient p) {
		doctorPatientList.put(d, p);

	}

	public Map<Doctor, Patient> showAssignedDoctors() {
		return doctorPatientList;
	}

	@Override
	public int compare(Doctor d1, Doctor d2) {
		return d1.getDoctorName().compareTo(d2.getDoctorName());
	}

	public void addDoctor(Doctor d1) {
		doctorList.add(d1);
		Hospital hospital = new Hospital(" ");
		Collections.sort(doctorList, hospital);

	}

	public List<Doctor> showDoctors() {
		return doctorList;

	}

	public void addPatient(Patient p) {
		patientList.add(p);

	}

	public List<Patient> showPatients() {
		Collections.sort(patientList);
		return patientList;
	}

	public void assignDoctor() {
		Hospital h2 = new Hospital("");
		for (Patient x : patientList) {
			for (Doctor y : doctorList) {
				if (x.getDisease().contains("skin")) {
					if (y.getDoctorSpeciality().contains("Dermatologist")) {
						Doctor d1 = y;
						Patient p1 = x;
						h2.addPatientsToDoctor(d1, p1);
					}
				}
				if (x.getDisease().equals("heartpatient")) {
					if (y.getDoctorSpeciality().equals("Surgeon")) {
						Doctor d2 = y;
						Patient p2 = x;
						h2.addPatientsToDoctor(d2, p2);
					}
				}

				if (x.getDisease().equals("earnose")) {
					if (y.getDoctorSpeciality().equals("ENT")) {
						Doctor d3 = y;
						Patient p3 = x;
						h2.addPatientsToDoctor(d3, p3);
					}
				}

			}
		}

	}

	
}
