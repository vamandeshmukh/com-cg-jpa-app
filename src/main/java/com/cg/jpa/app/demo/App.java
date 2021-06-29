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

		Department dep1 = new Department("HR", "Hyderabad");
		session.save(dep1);

		Employee emp1 = new Employee("Sonu", 10.5, dep1);
		session.save(emp1);

		System.out.println(session.get(Employee.class, emp1.getEid()).toString());

		transaction.commit();
		session.close();
		factory.close();

		System.out.println("End");
	}
}
