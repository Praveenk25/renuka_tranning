package com.itt.hospital.model;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.itt.hospital.constants.Constants;
import com.itt.hospital.pojo.Patient;

public class PatientData {

	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("/hibernate.cfg.xml").build();
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	Transaction transaction;

	// Insert the data for Patient
	public void insertPatientData(Patient patient) {
		try {
			transaction = session.beginTransaction();
			session.save(patient);

		} finally {

			transaction.commit();

		}
	}

	public void showPatientData() {
		try {
			List patient1 = session.createQuery("FROM Patient").list();
			for (Iterator iterator = patient1.iterator(); iterator.hasNext();) {
				Patient patient = (Patient) iterator.next();
				System.out.print("Patient ID: " + patient.getId());
				System.out.print("Patient Name: " + patient.getPatientName());
				System.out.println("\nPatient Age: " + patient.getPatientAge());
				System.out.println("Patient Gender: " + patient.getPatientGender());
				System.out.println("Patient Disease: " + patient.getDisease());
			}
		} finally {
			session.close();
			factory.close();
		}

	}
}
