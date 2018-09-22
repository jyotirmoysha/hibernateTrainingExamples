package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public final class HibernateUtil {

	private static SessionFactory factory;
	
	private HibernateUtil() {
	}
	
	static {

		Configuration cfg = new Configuration();
		cfg.configure(); // hibernate.cfg.xml - resources/src

		// myhibernate.cfg.xml - resources/src
		// cfg.configure("myhibernate.cfg.xml");

		// c:\myhibernate.cfg.xml on C-Drive
		// cfg.configure(new File("c:\myhibernate.cfg.xml"));

		// hibernate 1, 2, 3, 3.2
		// factory = cfg.buildSessionFactory();
		// if you want to work with oracle db uncomment 

		// hibernate 4, 5
		ServiceRegistry registry = 
				new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties())
					.build();
		factory = cfg.buildSessionFactory(registry);
	}
	
	public static SessionFactory getSessionFactory() {
		
		return factory;
	}
	
	public static void clearSessionFactory() {
		
		factory.close();
	}
}







