package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "LAPTOP_DETAILS_2")
public class Laptop {

	@Id
	@Column(name = "LAPTOP_SERIALNUMBER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serialnumber;
	
	@Column(name = "LAPTOP_NAME")
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
