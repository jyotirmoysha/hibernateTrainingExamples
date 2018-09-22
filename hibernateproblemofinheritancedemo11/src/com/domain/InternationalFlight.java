package com.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FLIGHT_DETAILS_1")
@DiscriminatorValue(value = "international")
public class InternationalFlight extends Flight {

	@Column(name = "FLIGHT_INTER_FROM_COUNTRY")
	private String fromCountry;
	
	@Column(name = "FLIGHT_INTER_TO_COUNTRY")
	private String toCountry;
	
	public InternationalFlight() {
	}

	public InternationalFlight(Long id, String name, String code,String fromCountry, String toCountry) {
		super(id, name, code);
		this.fromCountry = fromCountry;
		this.toCountry = toCountry;
	}

	public String getFromCountry() {
		return fromCountry;
	}

	public void setFromCountry(String fromCountry) {
		this.fromCountry = fromCountry;
	}

	public String getToCountry() {
		return toCountry;
	}

	public void setToCountry(String toCountry) {
		this.toCountry = toCountry;
	}

	@Override
	public String toString() {
		return "InternationalFlight ["+ super.toString() + ", fromCountry=" + fromCountry + ", toCountry=" + toCountry + "]";
	}
	
	
}
