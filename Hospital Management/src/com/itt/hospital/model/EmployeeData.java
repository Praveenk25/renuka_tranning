package com.itt.hospital.model;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.itt.hospital.constants.Constants;
import com.itt.hospital.pojo.Employees;


public class EmployeeData {

	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hbm.cfg.xml").build();
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	Constants constant = new Constants();
	Scanner scanner = new Scanner(System.in);

	public void insertEmployeeData() {
		try {
			System.out.println(constant.employeeId);
			int i5 = scanner.nextInt();
			scanner.nextLine();
			System.out.println(constant.employeeName);
			String s = scanner.nextLine();
			System.out.println(constant.employeeSalary);
			double d = scanner.nextDouble();
			System.out.println(constant.employeeJoiningD);
			int dayOfMonth = scanner.nextInt();
			int month = scanner.nextInt();
			int year = scanner.nextInt();
			LocalDate ld = LocalDate.of(year, month, dayOfMonth);
			Employees employee = new Employees(i5, s, d, ld);
			session.save(employee);
			System.out.println(constant.employeeAdded);
			System.out.println("successfully saved");
		} finally {
			t.commit();
			scanner.close();
			session.close();
			factory.close();
		}

	}
}
