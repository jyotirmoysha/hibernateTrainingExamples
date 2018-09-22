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
		cfg.configure(); //hibernate.cfg.xml-resources/src
		
		//cfg.configure("myhibernate.cfg.xml");  //"myhibernate.cfg.xml-resources/src
		
		//cfg.configure(new File("d:\myhibernate.cfg.xml"));  //"d:\myhibernate.cfg.xml-resources/src
		
		//hibernate 1,2,3
		//factory=cfg.buildSessionFactory();
		
		//hibernate 4,5
		/*ServiceRegistry registry= new StandardServiceRegistryBuilder().configure().build();
		factory=cfg.buildSessionFactory(registry);*/
		
		ServiceRegistry registry= new StandardServiceRegistryBuilder()
				//.applySettings(cfg.getProperties())
				//.configure()
				.build();
		factory=cfg.buildSessionFactory(registry);
	}

	public static SessionFactory getSessionFactory() {
		
		return factory;
		
	}
	
	public static void clearSessionFactory() {
		factory.close();
	}
}
