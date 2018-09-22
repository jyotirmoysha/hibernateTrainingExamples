package com.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.domain.Department;
import com.domain.Employee;
import com.util.HibernateUtil;

public class TestCase {

	public static void main(String[] args) {

		Employee employee = new Employee(null, "Jerry", 99999d);
		Employee employee2 = new Employee(null, "Popeye", 79999d);

		Set<Employee> employees = new HashSet<>();
		employees.add(employee);
		employees.add(employee2);
		
		Department department = new Department(null, "Computer", employees);
		
		//---------------------------------------------------------
		
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();
		session.save(department);
		session.getTransaction().commit();
		session.close();
	}
}


