package HospitalManagement;

import java.util.*;

public class Admin {

	private static Scanner cin = new Scanner(System.in);

	public static void main(String args[])

	{
		Hospital h1 = new Hospital("ECHS");
		System.out.println(" Welcome to Hospital ECHS");
		int choice = 0;
		while (true) {
			System.out.println(
					" Press 1 to add doctor \n Press 2 to show doctors.\n Press 3 to add patient \n Press 4 to Exit");
			if (cin.hasNext())
				choice = cin.nextInt();

			switch (choice) {
			case 1:
				System.out.println("How many Doctors you want to add");
				int i = cin.nextInt();
				cin.nextLine();
				for (int j = 0; j < i; j++)
					System.out.println("Enter Doctor Name ");
				String s1 = cin.nextLine();

				System.out.println("Enter Doctor Speciality");
				String s2 = cin.nextLine();
				Doctor d1 = new Doctor(s1, s2);
				h1.addDoctor(d1);
				System.out.println("\n The Doctor is added.");

				break;

			case 2:
				System.out.println(h1.showDoctors());
				break;

			case 3:
				System.out.println("How many Patients you want to add");
				int i1 = cin.nextInt();
				cin.nextLine();
				for (int k = 0; k < i1; k++) {
					System.out.println("Enter Patient's Name ");
					String s3 = cin.nextLine();
					System.out.println("Enter Patient's Age");
					int i2 = cin.nextInt();
					cin.nextLine();
					if (i2 > 100) {
						System.out.println("Please provide valid Age");
						System.out.println("Enter Patient's Age");
						int i3 = cin.nextInt();
						cin.nextLine();
						System.out.println("Enter Patient's Gender ");
						String s4 = cin.nextLine();
						System.out.println("Enter Patient's Disease ");
						String s5 = cin.nextLine();
						Patient p1 = new Patient(s3, i3, s4, s5);
						h1.addPatient(p1);
						System.out.println(h1.showPatients());
					} else {
						System.out.println("Enter Patient's Gender ");
						String s4 = cin.nextLine();
						System.out.println("Enter Patient's Disease ");
						String s5 = cin.nextLine();
						Patient p1 = new Patient(s3, i2, s4, s5);
						h1.addPatient(p1);
						System.out.println(h1.showPatients());

					}
				}

				break;

			case 4: {
				System.exit(0);
			}

			}

		}
		// cin.close();
	}
}
