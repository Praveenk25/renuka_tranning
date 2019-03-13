package com.itt.hospital.model;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.itt.hospital.constants.Constants;
import com.itt.hospital.pojo.Patient;

public class PatientData {
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	Constants constant = new Constants();
	Scanner scanner = new Scanner(System.in);

	// Insert the data for Patient
	public void insertPatientData() {
		try {
			System.out.println(constant.patientId);
			int id1 = scanner.nextInt();
			scanner.nextLine();
			System.out.println(constant.patientName);
			String s3 = scanner.nextLine();
			System.out.println(constant.patientAge);
			int i2 = scanner.nextInt();
			scanner.nextLine();
			if (i2 > 100) {
				System.out.println(constant.validAge);
				System.out.println(constant.patientAge);
				int i3 = scanner.nextInt();
				scanner.nextLine();
				System.out.println(constant.patientGender);
				String s4 = scanner.nextLine();
				System.out.println(constant.patientDisease);
				String s5 = scanner.nextLine();
				Patient patient = new Patient(id1, s3, i3, s4, s5);
				session.save(patient);

			} else {
				System.out.println(constant.patientGender);
				String s4 = scanner.nextLine();
				System.out.println(constant.patientDisease);
				String s5 = scanner.nextLine();
				Patient patient = new Patient(id1, s3, i2, s4, s5);
				session.save(patient);
			}
		} finally {
			scanner.close();
			t.commit();
			session.close();
			factory.close();

		}
	}

	public java.util.List showPatientData() {
		String sql_query = "from Patient";
		Query query = session.createQuery(sql_query);
		// for fetch we need iterator
		java.util.List list = query.list();
		return list;
	}

}
