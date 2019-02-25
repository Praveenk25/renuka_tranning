package HospitalManagement;



public class Doctor {

	private String doctorName;
	private String doctorSpeciality;
	public Doctor(String d, String ds) {

		this.doctorName = d;
		this.setDoctorSpeciality(ds);
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