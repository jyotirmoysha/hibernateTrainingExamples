package com.domain;

public class Laptop {

	private Long serialnumber;
	private String name;
	
	public Laptop() {
	}

	public Laptop(Long serialnumber, String name) {
		super();
		this.serialnumber = serialnumber;
		this.name = name;
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
