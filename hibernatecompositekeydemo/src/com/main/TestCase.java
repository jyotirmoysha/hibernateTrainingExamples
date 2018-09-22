package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.domain.Credentials;
import com.domain.User;
import com.util.HibernateUtil;

public class TestCase {

	public static void main(String[] args) {

		Credentials credentials = new Credentials("Jerry", "Jerry@123");
		User user = new User();
		user.setCredentials(credentials);
		user.setMobilenumber(9292929292l);

		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();

		Session session2 = factory.openSession();
		User user2 = (User) session2.get(User.class, credentials);
		System.out.println(user2.getMobilenumber());
		session2.close();
		
		Session session3 = factory.openSession();
		session3.beginTransaction();
		session3.delete((User) session3.get(User.class, credentials));
		session3.getTransaction().commit();
		session3.close();
		
		HibernateUtil.clearSessionFactory();
	}
}




