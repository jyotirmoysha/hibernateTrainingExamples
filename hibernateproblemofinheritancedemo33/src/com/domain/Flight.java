package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Flight {

	@Id
	@Column(name = "FLIGHT_ID")
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	
	@Column(name = "FLIGHT_NAME")
	private String name;

	@Column(name = "FLIGHT_CODE")
	private String code;

	public Flight() {
	}

	public Flight(Long id, String name, String code) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", code=" + code + "]";
	}

}
