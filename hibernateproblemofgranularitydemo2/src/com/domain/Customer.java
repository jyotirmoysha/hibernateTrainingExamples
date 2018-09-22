package com.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_DETAILS")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CUSTOMER_ID")
	private Long id;
	
	@Column(name = "CUSTOMER_NAME")
	private String name;
	
	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(name = "street",
					column = @Column(name = "CUSTOMER_TEMP_STREET")),
			@AttributeOverride(name = "city",
			column = @Column(name = "CUSTOMER_TEMP_CITY"))
	})
	private Address temporaryAddress;

	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(name = "street",
					column = @Column(name = "CUSTOMER_PERM_STREET")),
			@AttributeOverride(name = "city",
			column = @Column(name = "CUSTOMER_PERM_CITY"))
	})
	private Address permanentAddress;

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

	public Address getTemporaryAddress() {
		return temporaryAddress;
	}

	public void setTemporaryAddress(Address temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

}
