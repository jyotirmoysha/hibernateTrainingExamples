package com.domain;

public class Employee {

	private Long id;
	private String name;
	
	private Laptop laptop;

	public Employee() {
	}
	
	public Employee(Long id, String name, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.laptop = laptop;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", laptop=" + laptop + "]";
	}
	
	
}
