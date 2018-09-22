package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.domain.Address;
import com.domain.Customer;
import com.util.HibernateUtil;

public class TestCase {

	public static void main(String[] args) {

		Address temporaryAddress = new Address("STREET1", "CITY1");
		Address permanentAddress = new Address("STREET1", "CITY1");
		Customer customer = new Customer();
		customer.setName("Tom");
		customer.setTemporaryAddress(temporaryAddress);
		customer.setPermanentAddress(permanentAddress);

		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();
		session.save(customer);
		session.getTransaction().commit();
		session.close();

		Session session2 = factory.openSession();
		Customer customer2 = (Customer) session2.get(Customer.class, 1l);
		session2.close();
		
		System.out.println(customer2.getName());
		System.out.println(customer2.getTemporaryAddress());
		System.out.println(customer2.getPermanentAddress());
		
		HibernateUtil.clearSessionFactory();
	}
}



