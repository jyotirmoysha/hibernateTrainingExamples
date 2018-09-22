package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.domain.Book;
import com.util.HibernateUtil;

public class TestCase4 {

	public static void main(String[] args) {

		// book object is in transient state
		Book javaBook =  new Book(null, "Java", 2929d);
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();		
		// book object is in persistent state
		Book book =  (Book) session.get(Book.class, 1l);
		session.close();

		// book object is in dettached state
		book.setPrice(2993d);
		
		Session session2 = factory.openSession();	
		session2.beginTransaction();
		//session2.merge(book);
		Book b3 = (Book) session2.merge(javaBook);
		session2.getTransaction().commit();
		session2.close();
		System.out.println(b3);
	}
}





