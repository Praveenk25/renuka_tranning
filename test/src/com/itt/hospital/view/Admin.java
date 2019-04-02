package com.itt.hospital.view;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.itt.hospital.constants.Constants;
import com.itt.hospital.controller.Hospital;
import com.itt.hospital.multithreading.DoctorAppointment;
import com.itt.hospital.multithreading.PatientAppointment;
import com.itt.hospital.pojo.Employee;
import com.itt.hospital.pojo.Patient;
import com.itt.hospital.service.DatabaseConnection;

public class Admin {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Hospital hospital = new Hospital("ECHS");
		Constants constant = new Constants();
		System.out.println(constant.WELCOME_MSG);
		int choice = 0;
		while (true) {
			System.out.println(constant.STATEMENT);
			if (scanner.hasNext()) {
				choice = scanner.nextInt();
			}

			switch (choice) {
			case 1: {
				System.out.println(constant.DOCTOR_NUMBER);
				int i = scanner.nextInt();
				scanner.nextLine();
				for (int j = 0; j < i; j++) {
					System.out.println(constant.DOCTOR_NAME);
					String s1 = scanner.nextLine();
					System.out.println(constant.DOCTOR_SPECIALITY);
					String s2 = scanner.nextLine();
					hospital.addDoctors( s1, s2);
					System.out.println(constant.DOCTOR_ADDED);
				}
			}

				break;

			case 2: {
				hospital.showDoctors();
			}
				break;

			case 3: {
				System.out.println(constant.PATIENT_NUMBER);
				int i1 = scanner.nextInt();
				scanner.nextLine();
				for (int k = 0; k < i1; k++) {
					System.out.println(constant.PATIENT_NAME);
					String s3 = scanner.nextLine();
					System.out.println(constant.PATIENT_AGE);
					int i2 = scanner.nextInt();
					scanner.nextLine();
					if (i2 > 100) {
						System.out.println(constant.VALID_AGE);
						System.out.println(constant.PATIENT_AGE);
						int i3 = scanner.nextInt();
						scanner.nextLine();
						System.out.println(constant.PATIENT_GENDER);
						String s4 = scanner.nextLine();
						System.out.println(constant.PATIENT_DISEASE);
						String s5 = scanner.nextLine();
						Patient patient = new Patient(s3, i3, s4, s5);
						hospital.addPatient(patient);
						System.out.println("successfully saved");

					} else {
						System.out.println(constant.PATIENT_GENDER);
						String s4 = scanner.nextLine();
						System.out.println(constant.PATIENT_DISEASE);
						String s5 = scanner.nextLine();
						Patient patient = new Patient( s3, i2, s4, s5);
						hospital.addPatient(patient);
						System.out.println("successfully saved");
					}
				}
			}
				break;

			case 4: {
				hospital.showPatients();
			}
				break;

			case 5: {
				List<Integer> task = new ArrayList<Integer>();
				int Max_Capacity = 5;
				Thread tDoctor = new Thread(new DoctorAppointment(task, Max_Capacity));
				Thread tPatient = new Thread(new PatientAppointment(task));
				tDoctor.start();
				tPatient.start();
				tDoctor.run();
				tPatient.run();
			}
				break;

			case 6: {
				System.out.println(constant.EMPLOYEES_NUMBER);
				int i4 = scanner.nextInt();
				scanner.nextLine();
				for (int j = 0; j < i4; j++) {
					System.out.println(constant.EMPLOYEE_NAME);
					String s = scanner.nextLine();
					System.out.println(constant.EMPLOYEE_SALARY);
					double d = scanner.nextDouble();
					System.out.println(constant.EMPLOYEE_JOINING_DATE);
					int dayOfMonth = scanner.nextInt();
					int month = scanner.nextInt();
					int year = scanner.nextInt();
					LocalDate ld = LocalDate.of(year, month, dayOfMonth);
					Employee employee = new Employee( s, d, ld);
					hospital.addEmployee(employee);
					System.out.println(constant.EMPLOYEES_ADDED);
				}
			}
				break;

			case 7: {
				hospital.showEmployees();
			}
				break;

			case 8: {
				System.exit(0);
			}
				break;

			}

		}
	}

}
