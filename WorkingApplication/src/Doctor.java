import java.util.ArrayList;

public class Doctor {


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
