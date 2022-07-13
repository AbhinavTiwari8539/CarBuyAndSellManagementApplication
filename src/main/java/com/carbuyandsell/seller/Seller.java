package com.carbuyandsell.seller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seller {
	
	@Id
	private int carnumber;
	private int carmodel;
	private String carcompany;
	private int manufactureyear;
	private int year;
	private int sellingprice;
	private String carowner;
	private Long contactno;
	
	public int getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(int carmodel) {
		this.carmodel = carmodel;
	}
	public String getCarcompany() {
		return carcompany;
	}
	public void setCarcompany(String carcompany) {
		this.carcompany = carcompany;
	}
	public Long getContactno() {
		return contactno;
	}
	public void setContactno(Long contactno) {
		this.contactno = contactno;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSellingprice() {
		return sellingprice;
	}
	public void setSellingprice(int sellingprice) {
		this.sellingprice = sellingprice;
	}
	public int getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(int carnumber) {
		this.carnumber = carnumber;
	}
	public int getManufactureyear() {
		return manufactureyear;
	}
	public void setManufactureyear(int manufactureyear) {
		this.manufactureyear = manufactureyear;
	}
	public String getCarowner() {
		return carowner;
	}
	public void setCarowner(String carowner) {
		this.carowner = carowner;
	}
	@Override
	public String toString() {
		return "Seller [carmodel=" + carmodel + ", carcompany=" + carcompany + ", carnumber=" + carnumber
				+ ", manufactureyear=" + manufactureyear + ", year=" + year + ", sellingprice=" + sellingprice
				+ ", carowner=" + carowner + ", contactno=" + contactno + "]";
	}
	
}
