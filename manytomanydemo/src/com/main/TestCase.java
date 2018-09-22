package com.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.domain.Course;
import com.domain.Student;
import com.util.HibernateUtil;

public class TestCase {

	public static void main(String[] args) {
		
		Course course = new Course(null, "Java");
		Course course2 = new Course(null, "C#");
		
		Set<Course> courses = new HashSet<>();
		courses.add(course);
		courses.add(course2);
		
		Student student = new Student(null, "Popeye", courses);
		
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
	}
}
