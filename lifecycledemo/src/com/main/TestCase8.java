package com.main;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.HibernateUtil;

public class TestCase8 {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();		
		Query query = session.createQuery(
				"from com.domain.Book book where book.id=1");
		query.setCacheable(true);
		System.out.println(query.list());
		session.close();

		Session session2 = factory.openSession();		
		Query query2 = session2.createQuery(
				"from com.domain.Book book where book.id=1");
		//query2.setLong(0, 1l);
		query2.setCacheable(true);
		System.out.println(query2.list());
		session2.close();

		
	}
}





