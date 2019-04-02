package com.itt.hospital.model;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.itt.hospital.pojo.Employee;

public class EmployeeData {

	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	Transaction transaction;

	public void insertEmployeeData(Employee employee) {
		try {
			transaction = session.beginTransaction();

			session.save(employee);
			session.flush();

		} finally {

			transaction.commit();
		}

	}

	public void showEmployeeData() {
		try {
			List employee1 = session.createQuery("FROM Employee").list();
			for (Iterator iterator = employee1.iterator(); iterator.hasNext();) {
				Employee employee = (Employee) iterator.next();
				System.out.println("Employee Id: " + employee.getId());
				System.out.println("Employee Name: " + employee.getEmployeeName());
				System.out.println("Employee Salary: " + employee.getEmployeeSalary());
				System.out.println("Employee Joining Date: " + employee.getJoiningDate());
			}
		} finally {
			session.close();
			factory.close();
		}

	}
}
