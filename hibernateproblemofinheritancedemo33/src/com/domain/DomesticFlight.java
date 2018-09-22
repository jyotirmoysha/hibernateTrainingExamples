package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DOMESTIC_FLIGHT_DETAILS_3")
public class DomesticFlight extends Flight {

	@Column(name = "FLIGHT_DOMESTIC_FROM_CITY")
	private String fromCity;

	@Column(name = "FLIGHT_DOMESTIC_TO_CITY")
	private String toCity;
	
	public DomesticFlight() {
	}

	public DomesticFlight(Long id, String name, String code, String fromCity, String toCity) {
		super(id, name, code);
		this.fromCity = fromCity;
		this.toCity = toCity;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	@Override
	public String toString() {
		return "DomesticFlight [" + super.toString() + ",fromCity=" + fromCity + ", toCity=" + toCity + "]";
	}
	
	
	
}
