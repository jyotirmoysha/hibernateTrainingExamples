package com.domain;

public class User {

	private Credentials credentials;
	private Long mobilenumber;

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public Long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

}
