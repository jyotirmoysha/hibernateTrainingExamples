package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "LAPTOP_DETAILS")
public class Laptop {

	@Id
	@Column(name = "LAPTOP_SERIALNUMBER")
	@GeneratedValue(generator = "laptopforeigngen")
	@GenericGenerator(name = "laptopforeigngen", strategy = "foreign", 
			parameters = @Parameter(name = "property", value = "employee"))
	private Long serialnumber;
	
	@Column(name = "LAPTOP_NAME")
	private String name;

	@OneToOne
	@PrimaryKeyJoinColumn
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
