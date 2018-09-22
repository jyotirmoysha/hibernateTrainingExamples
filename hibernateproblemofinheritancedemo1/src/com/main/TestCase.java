package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.domain.DomesticFlight;
import com.domain.InternationalFlight;
import com.util.HibernateUtil;

public class TestCase {

	public static void main(String[] args) {
		
		DomesticFlight domesticFlight = new DomesticFlight(0l, "SpiceJet", "S-007", "Mumbai", "Hyd");
		InternationalFlight internationalFlight = new InternationalFlight(0l,"Air India", "A-123", "INDIA","DUBAI");
		
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();
		session.save(domesticFlight);
		session.save(internationalFlight);
		session.getTransaction().commit();
		session.close();
		
		Session session2 = factory.openSession();
		DomesticFlight domesticFlight2 = (DomesticFlight) session2.get(DomesticFlight.class, 1l);
		
		System.out.println(domesticFlight2.getName());
		
		session2.close(); 
		HibernateUtil.clearSessionFactory();
	}
}



