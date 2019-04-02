package com.itt.hospital.persistence;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.itt.hospital.bean.PersonDetails;


public class UserDetails {
	
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("/hibernate.cfg.xml").build();
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	
	public void addUserDeatils(String fullName, String email, String username, String password, String role) {
		try {
			
			PersonDetails persondetails = new PersonDetails();
			persondetails.setFullName(fullName);
			persondetails.setEmail(email);
			persondetails.setUserName(username);
			persondetails.setPassword(password);
			persondetails.setRole(role);
			
			session.save(persondetails);
			
			transaction.commit();
			
		} catch (HibernateException he) {
			System.out.println(he.getMessage());
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
