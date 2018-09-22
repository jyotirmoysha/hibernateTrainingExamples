package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.domain.Book;
import com.util.HibernateUtil;

public class TestCase6 {

	public static void main(String[] args) {

		// book object is in transient
		Book book = new Book(null, "C++", 999d);
				
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
			
		session.save(book);

		book.setPrice(6565d);
		session.saveOrUpdate(book);
		
		book.setPrice(7565d);
		session.saveOrUpdate(book);
		
		session.getTransaction().commit();
		session.close();
		
		// book object is in dettached state
		System.out.println(book);
		
	}
}





