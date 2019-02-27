package HospitalManagement;

class Patient implements Comparable<Patient> {
	

	private int id;
	private String patientName;
	private int patientAge;
	private String patientGender;
	private String disease;

	public Patient(int id, String patientName, int patientAge, String patientGender, String disease) {
		this.id = id;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.disease = disease;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	    public String getDisease() {
			return disease;
		}
		

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String toString() {
		return (id + " " + patientName + " " + patientAge + " " + patientGender + " " + disease);
	}

	@Override
	public int compareTo(Patient otherpatient) {
		return this.getId() - otherpatient.getId();
	}

}
