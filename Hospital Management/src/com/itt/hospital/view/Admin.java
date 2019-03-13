package com.itt.hospital.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.itt.hospital.constants.Constants;
import com.itt.hospital.controller.Hospital;
import com.itt.hospital.multithreading.DoctorThread;
import com.itt.hospital.multithreading.PatientThread;

public class Admin {

	private static Scanner cin = new Scanner(System.in);

	public static void main(String args[]) throws ClassNotFoundException, SQLException {

		Hospital hospital = new Hospital("ECHS");
		Constants constant = new Constants();
		System.out.println(constant.welcomeMsg);
		int choice = 0;
		while (true) {
			System.out.println(constant.Statement);
			if (cin.hasNext()) {
				choice = cin.nextInt();
			}

			switch (choice) {
			case 1: {
				System.out.println(constant.doctorNumber);
				int i = cin.nextInt();
				cin.nextLine();
				for (int j = 0; j < i; j++) {
					System.out.println(constant.doctorName);
					String s1 = cin.nextLine();
					System.out.println(constant.doctorSpeciality);
					String s2 = cin.nextLine();
					hospital.addDoctors(s1, s2);
					System.out.println(constant.doctorAdded);
				}
			}
				break;

			case 2: {
				hospital.showDoctors();
			}
				break;

			case 3: {
				System.out.println(constant.patientNumber);
				int i1 = cin.nextInt();
				cin.nextLine();
				for (int k = 0; k < i1; k++) {
					hospital.addPatient();

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
				Thread tDoctor = new Thread(new DoctorThread(task, Max_Capacity));
				Thread tPatient = new Thread(new PatientThread(task));
				tDoctor.start();
				tPatient.start();
				tDoctor.run();
				tPatient.run();
			}
				break;

			case 6: {
				System.out.println(constant.employeesNumber);
				int i4 = cin.nextInt();
				cin.nextLine();
				for (int j = 0; j < i4; j++) {
					hospital.addEmployee();
				}
			}
				break;

			case 7: {
				System.out.println();
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
