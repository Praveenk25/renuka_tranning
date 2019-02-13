import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

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




