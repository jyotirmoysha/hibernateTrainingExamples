package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.domain.Book;
import com.util.HibernateUtil;

public class TestCase2 {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		// book object is in persistent state
		Book book =  (Book) session.get(Book.class, 1l);
		System.out.println(book);

		book.setPrice(2919d);
		
		///book.setPrice(999d);
		
		session.getTransaction().commit();
		session.close();
		
		// book object is in dettached state
		System.out.println(book);
		
	}
}





