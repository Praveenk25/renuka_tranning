 import java.util.*;
 class Hospital {

List <Doctor> doctorList = new ArrayList<Doctor>();
List <Patient> patientList = new ArrayList<Patient>();
String hospitalName;
void addDoctor(Doctor o)
{
    doctorList.add(o);

}
void addPatient(Patient o)
{
    patientList.add(o);

}
Hospital(String name)
{
    this.hospitalName=name;
}

public List<Doctor> showDoctors()
{
    return doctorList;
}
public List<Patient> showPatients()
{
    return patientList;
}

public void assignDoctor()
{ try{
    for (Patient x: patientList)
    {      for (Doctor y: doctorList)
            {     if (x.getDisease().equals("eye"))
                        {
                            if (y.getDoctorspeciality().equals("Opthalmologist"))
                                {
                                   y.addPatientsToDoctor(x);
                                }
                        }
            if (x.getDisease().equals("heart patient"))
            {
                if (y.getDoctorspeciality().equals("Surgeon"))
                    {
                       y.addPatientsToDoctor(x);
                    }
            }

            if (x.getDisease().equals("earnose"))
            {
                if (y.getDoctorspeciality().equals("ENT"))
                    {
                       y.addPatientsToDoctor(x);
                    }
            }

            
        }

}

}
      catch(ConcurrentModificationException e)
		  { System.out.println(e.getMessage() + " Catch"); 
		  }
	  }

}






 class Doctor {


private String  doctorName;
private String  doctorSpeciality;
String  doctorStatus;
 ArrayList<Patient> DoctorPatientList= new ArrayList<Patient>();
Doctor(String c, String cc)
{
    this.doctorName=c;
    this.doctorSpeciality=cc;

}
public String  getDoctorName()
{
    return doctorName;
}

public ArrayList<Patient> getDoctorPatientList()
{   
    return DoctorPatientList;
}

public void addPatientsToDoctor(Patient o)
{
    DoctorPatientList.add(o);
}

String getDoctorspeciality()
{
    return doctorSpeciality;
}
public String toString()
{
    return (doctorName+""+doctorSpeciality);
}

}
 class Patient {
      
    

    private String patientName;
    private int patientAge;
    private String  patientGender;
    private String disease;
    Patient (String patientName, int patientAge,String patientGender, String disease)
    {
        this.patientName= patientName;
        this.patientGender= patientGender;
        this.patientAge=patientAge;
        this.disease=disease;
    }   

    public String getDisease()
    {return disease;}

    public String toString()
    {
        return (patientName+""+patientAge+""+patientGender +" "+ disease);
    }

}


 class Hos
{
	
	
public static void main (String args[])

{	
try {
	int n=0;
    Hospital h1= new Hospital("Appollo");
    int choice=0;
    Doctor o = new Doctor("Rai"," Surgeon");
    Doctor o1 = new Doctor("James"," Opthalmologist");
    Doctor o2 = new Doctor("Steve","ENT");
    
    
	while(true)
	{
		System.out.println("Press 1 to add doctor \n Press 2 to show doctors.\n Press 3 to add patient \n Press 4 Assign doctor to patients\n Press 5 Doctor and their patients \n Press 6 Exit");
		Scanner cin = new Scanner (System.in);
		choice = cin.nextInt();
    switch (choice)
    {
    case 1:    		h1.addDoctor(o);
                    h1.addDoctor(o1);
                    h1.addDoctor(o2);
					
		           System.out.println("\n The Doctor is added.");
                   break; 
				   
    case 2:     System.out.println(h1.showDoctors());
				break;	
                 
    case 3:        Patient p = new Patient ("\n Steven ", 21, " Male"," eye");
                    Patient p1 = new Patient ("\n Michael ", 12, " Male"," heart patient");
                    Patient p2 = new Patient ("\n Sara ", 23, " Female","earnose");
                    Patient p3 = new Patient ("\n Amy ", 31, " Female","earnose");
                    Patient p5 = new Patient ("\n Rocky ", 18, " Male"," eye");
                    Patient p4= new Patient ("\n Jessy ", 15, " Male"," heart patient");
                    h1.addPatient(p);
                    h1.addPatient(p1);
                    h1.addPatient(p2);
                    h1.addPatient(p3);
                    h1.addPatient(p4);
                    h1.addPatient(p5);
                     System.out.println(h1.showPatients());
                break;
						
    case 4:     {
                     h1.assignDoctor();
					 System.out.println("\n The doctor is assigned.");
					 break;
                }
			

    case 5:     {
                      System.out.println("\n The doctor patient list is: \n \n "+ ""+o2.getDoctorName()+""+o2.getDoctorPatientList());
					 
					  break;
					  
                }
				
    case 6: System.exit(0);
	} 
	}
}
catch(Exception e)
	{
		e.printStackTrace();
	}
	
				
			
}
    
    
}



