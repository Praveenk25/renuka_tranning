package HospitalManagement;

import java.time.LocalDate;
import java.util.*;

import HospitalStaff.Staff;
import HospitalStaff.StaffCompare;

public class Admin {

	private static Scanner cin = new Scanner(System.in);

	public static void main(String args[]) {

		Hospital h1 = new Hospital("ECHS");
		Constants c = new Constants();
		StaffCompare sc = new StaffCompare();
		System.out.println(c.welcomeMsg);
		int choice = 0;
		while (true) {

			System.out.println(
					" Press 1 to add doctor \n Press 2 to show doctors.\n Press 3 to add patient \n Press 4 to show Patients \n Press 5 to assign doctors to patient \n Press 6 to show assigned Doctor-Patient List \n Press 7 to book Doctor Patient Appointment \n Press 8 to add Staff \n Press 9 to show Staff \n Press 10 to Exit");
			if (cin.hasNext()) {
				choice = cin.nextInt();
			}

			switch (choice) {
			case 1:
				System.out.println(c.doctorNumber);
				int i = cin.nextInt();
				cin.nextLine();
				for (int j = 0; j < i; j++) {
					System.out.println(c.doctorName);
					String s1 = cin.nextLine();
					System.out.println(c.doctorSpeciality);
					String s2 = cin.nextLine();
					Doctor d1 = new Doctor(s1, s2);
					h1.addDoctor(d1);
					System.out.println(c.doctorAdded);
				}

				break;

			case 2:
				System.out.println(h1.showDoctors());
				break;

			case 3:
				System.out.println(c.patientNumber);
				int i1 = cin.nextInt();
				cin.nextLine();
				for (int k = 0; k < i1; k++) {
					System.out.println("Generate id for Patient");
					int id1 = cin.nextInt();
					cin.nextLine();
					System.out.println(c.patientName);
					String s3 = cin.nextLine();
					System.out.println(c.patientAge);
					int i2 = cin.nextInt();
					cin.nextLine();
					if (i2 > 100) {
						System.out.println(c.validAge);
						System.out.println(c.patientAge);
						int i3 = cin.nextInt();
						cin.nextLine();
						System.out.println(c.patientGender);
						String s4 = cin.nextLine();
						System.out.println(c.patientDisease);
						String s5 = cin.nextLine();
						Patient p1 = new Patient(id1, s3, i3, s4, s5);
						h1.addPatient(p1);
						id1++;
					} else {
						System.out.println(c.patientGender);
						String s4 = cin.nextLine();
						System.out.println(c.patientDisease);
						String s5 = cin.nextLine();
						Patient p1 = new Patient(id1, s3, i2, s4, s5);
						h1.addPatient(p1);
						id1++;

					}
				}

				break;

			case 4: {
				System.out.println(h1.showPatients());
			}
				break;
			case 5: {
				h1.assignDoctor();
				System.out.println("The doctor is assigned");
			}
				break;
			case 6: {
				System.out.println(h1.showAssignedDoctors());
			}
				break;
			case 7: {
				List<Integer> task = new ArrayList<Integer>();
				int MAX_CAPACITY = 5;
				Thread tDoctor = new Thread(new AssignDoctorToPatient(task, MAX_CAPACITY), "Doctor");
				Thread tPatient = new Thread(new AssignPatientToDoctor(task), "Patient");
				tDoctor.start();
				tDoctor.run();
				tPatient.start();
				tPatient.run();
			}
				break;
			case 8:
				System.out.println("How many Employees you want to add");
				int i4 = cin.nextInt();
				cin.nextLine();

				for (int j = 0; j < i4; j++) {
					System.out.println("Enter Employee id");
					int i5 = cin.nextInt();
					cin.nextLine();
					System.out.println("Enter Employee Name");
					String s = cin.nextLine();
					System.out.println("Enter Employee Salary");
					double d = cin.nextDouble();
					System.out.println("Enter Employee Joining Date");
					int dayOfMonth = cin.nextInt();
					int month = cin.nextInt();
					int year = cin.nextInt();
					LocalDate ld = LocalDate.of(year, month, dayOfMonth);
					Staff sf = new Staff(i5, s, d, ld);
					sc.addEmployee(sf);

					System.out.println("The Employees are added");
				}
				break;
			case 9:
				System.out.println(sc.showEmployees());
				break;

			case 10: {
				System.exit(0);
			}
				break;

			}

		}
	}

}
