package com.domain;

import java.util.Set;

public class Course {

	private Long courseId;
	private String name;
	private Set<Student> students;

	public Course() {
	}

	public Course(Long courseId, String name) {
		super();
		this.courseId = courseId;
		this.name = name;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + "]";
	}

}
