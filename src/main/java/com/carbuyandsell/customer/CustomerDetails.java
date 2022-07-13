package com.carbuyandsell.customer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerDetails {
	
	@Id
	private Long contactno;
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getContactno() {
		return contactno;
	}
	public void setContactno(Long contactno) {
		this.contactno = contactno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
