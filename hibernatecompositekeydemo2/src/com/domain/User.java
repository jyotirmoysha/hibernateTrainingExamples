package com.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class User {

	@EmbeddedId
	@AttributeOverrides(value = {
			@AttributeOverride(name = "username", 
					column = @Column(name = "USER_DETAILS_USERNAME")),
			@AttributeOverride(name = "password", 
				column = @Column(name = "USER_DETAILS_PASSWORD"))
	})
	private Credentials credentials;
	
	@Column(name = "USER_DETAILS_MOBILENUMBER")
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
