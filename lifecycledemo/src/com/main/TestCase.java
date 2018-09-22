package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.domain.Book;
import com.util.HibernateUtil;

public class TestCase {

	public static void main(String[] args) {

		// book object is in transient state
		Book book = new Book(null, "Hibernate", 999d);

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		// book object is in persistent state
		Long id = (Long) session.save(book);
		
		System.out.println("id:" + id);
		session.getTransaction().commit();
		session.close();
		
		// book object is in dettached state
		System.out.println(book);
	}
}





