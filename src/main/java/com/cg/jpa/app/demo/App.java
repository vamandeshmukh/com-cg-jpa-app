package com.cg.jpa.app.demo;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author Vaman
 *
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Start");

		Configuration config = new Configuration();
		SessionFactory factory = config.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

//		Department dep1 = new Department("HR", "Hyderabad");
//		Employee emp1 = new Employee("Sonu", 10.5, dep1);

		transaction.commit();
		session.close();
		factory.close();

		System.out.println("End");
	}
}
