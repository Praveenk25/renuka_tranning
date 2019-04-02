package com.itt.hospital.pojo;

public class Doctor {
	private int id;
	private String doctorName;
	private String doctorSpeciality;

	public Doctor(int Id, String d, String ds) {
		this.id = Id;
		this.doctorName = d;
		this.doctorSpeciality = ds;
		;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorSpeciality() {
		return doctorSpeciality;
	}

	public void setDoctorSpeciality(String ds) {
		this.doctorSpeciality = ds;
	}

	public String toString() {
		return (doctorName + " " + doctorSpeciality);
	}

}