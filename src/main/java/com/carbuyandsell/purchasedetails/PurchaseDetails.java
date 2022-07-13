package com.carbuyandsell.purchasedetails;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PurchaseDetails {
	@Id
	private int carnumber;
	private Long contactno;
	
	public int getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(int carnumber) {
		this.carnumber = carnumber;
	}
	public Long getContactno() {
		return contactno;
	}
	public void setContactno(Long contactno) {
		this.contactno = contactno;
	}
}
