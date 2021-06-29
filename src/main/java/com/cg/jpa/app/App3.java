package com.cg.jpa.app;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author Vaman
 *
 */

public class App3 {
	public static void main(String[] args) {
		System.out.println("Start");

		Configuration config = new Configuration();

		SessionFactory factory = config.configure().buildSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Department dep1 = new Department("Admin", "Pune");

		session.save(dep1); // insert

		Department dep5 = session.get(Department.class, dep1.getDid());
		System.out.println(dep1.toString());

//		Department dep3;
//
//		dep3 = session.get(Department.class, 20); // select
//
//		System.out.println("1 " + dep3.toString());
//
//		dep3.setCity("Bengaluru");
//		session.update(dep3); // update
//		dep3 = session.get(Department.class, 20);
//		System.out.println("2 " + dep3.toString());
//		session.delete(dep3); // delete
////		session.delete("Department", dep3);
//		dep3 = session.get(Department.class, 20);
//		if (null != dep3) {
//			System.out.println("3 " + dep3.toString());
//		}
		transaction.commit();
		session.close();
		factory.close();

		System.out.println("End");
	}
}
