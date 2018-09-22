package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.domain.Department;
import com.domain.Employee;
import com.util.HibernateUtil;

public class TestCase2 {

	public static void main(String[] args) {

		
		Department department = new Department();
		department.setName("Computer");
		
		Employee employee = new Employee(null, "Jerry", 99999d);
		employee.setDepartment(department);
		
		Employee employee2 = new Employee(null, "Tom", 99999d);
		employee2.setDepartment(department);

		//---------------------------------------------------------
		
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();
		System.out.println(session.save(employee));
		System.out.println(session.save(employee2));
		session.getTransaction().commit();
		session.close();
		
		Session session2 = factory.openSession();
		session2.beginTransaction();
		Employee emp = (Employee) session2.get(Employee.class, 1l);		
		emp.getDepartment().setEmployees(null);
		session2.delete(emp);
		session2.getTransaction().commit();
		session2.close();
	}
}









