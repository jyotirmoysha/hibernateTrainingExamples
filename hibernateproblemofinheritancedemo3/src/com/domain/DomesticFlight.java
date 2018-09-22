package com.domain;

public class DomesticFlight extends Flight {

	private String fromCity;
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
