package com.carbuyandsell.buyer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Buyer{
	@Id
	private int carnumber;
	private int carmodel;
	private String carcompany;
	private int sellingprice;
	private int year;
	
	
	public int getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(int carnumber) {
		this.carnumber = carnumber;
	}
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
	public int getSellingprice() {
		return sellingprice;
	}
	public void setSellingprice(int sellingprice) {
		this.sellingprice = sellingprice;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Buyer [carnumber=" + carnumber + ", carmodel=" + carmodel + ", carcompany=" + carcompany
				+ ", sellingprice=" + sellingprice + ", year=" + year + "]";
	}
	
}
