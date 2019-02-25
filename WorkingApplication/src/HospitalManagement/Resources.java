package HospitalManagement;


public class Resources {
	 synchronized public int accessBed(int bedcount) {
		 void assignPatienttobed() {
			 int bedcount=50;
			  for (int i = 0; i < patientList.size(); i++) {
				Patient obj = patientList.get(i);
				if(bedcount>0) {
						 System.out.println("Assignment is completed.");
			}
			   if(bedcount<0){
				  System.out.println("No beds Available");
			  }
		  }
		}
	 
		 
	 }

