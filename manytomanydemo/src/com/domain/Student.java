package com.domain;

import java.util.Set;

public class Student {

	private Long rollno;
	private String name;
	private Set<Course> courses;

	public Student() {
	}

	public Student(Long rollno, String name, Set<Course> courses) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.courses = courses;
	}

	public Long getRollno() {
		return rollno;
	}

	public void setRollno(Long rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", courses=" + courses + "]";
	}

}
