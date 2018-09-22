package com.domain;

public class Laptop {

	private Long serialnumber;
	private String name;

	private Employee employee;
	
	public Laptop() {
	}

	public Laptop(Long serialnumber, String name) {
		super();
		this.serialnumber = serialnumber;
		this.name = name;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public Long getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(Long serialnumber) {
		this.serialnumber = serialnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Laptop [serialnumber=" + serialnumber + ", name=" + name + "]";
	}

}
