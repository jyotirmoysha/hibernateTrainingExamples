package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.domain.Employee;
import com.domain.Laptop;
import com.util.HibernateUtil;

public class TestCase {

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop(null, "Dell");
		Employee employee = new Employee(null, "John", laptop);
		
		laptop.setEmployee(employee);
		
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();
		System.out.println("Employee Id:" + session.save(employee));
		session.getTransaction().commit();
		session.close();
		
		HibernateUtil.clearSessionFactory();
	}
}




