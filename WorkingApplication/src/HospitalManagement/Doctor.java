package HospitalManagement;

public class Doctor {

	private String doctorName;
	private String doctorSpeciality;

	Doctor(String d, String ds) {
		this.doctorName = d;
		this.doctorSpeciality = ds;

	}

	public String getDoctorName() {
		return doctorName;
	}

	public String getDoctorSpeciality() {
		return doctorSpeciality;
	}

	public String toString() {
		return (doctorName + " " + doctorSpeciality);
	}

}