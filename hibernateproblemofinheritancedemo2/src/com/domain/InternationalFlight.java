package com.domain;

public class InternationalFlight extends Flight {

	private String fromCountry;
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
