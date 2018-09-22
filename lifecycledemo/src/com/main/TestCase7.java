package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.domain.Book;
import com.util.HibernateUtil;

public class TestCase7 {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();		
		Book book =  (Book) session.get(Book.class, 1l);
		// session.evict(book);
		// session.clear();		
		session.close();
		
		Session session2 = factory.openSession();
		Book book2 =  (Book) session2.get(Book.class, 1l);
		session2.close();
		
		System.out.println(book == book2);
		System.out.println(book.equals(book2));
	}
}





