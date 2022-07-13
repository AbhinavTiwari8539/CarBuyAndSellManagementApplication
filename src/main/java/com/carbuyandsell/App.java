package com.carbuyandsell;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.carbuyandsell.buyer.Buyer;
import com.carbuyandsell.customer.CustomerDetails;
import com.carbuyandsell.purchasedetails.PurchaseDetails;
import com.carbuyandsell.seller.Seller;

public class App {
	private static final Seller Seller = null;

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Buy_Sell");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your details: ");
		System.out.print("Enter your contact No. ");
		Long conno = sc.nextLong();
		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.print("Enter your adrress:");
		String add = sc.next();
		CustomerDetails customer = new CustomerDetails();

		customer.setContactno(conno);
		customer.setName(name);
		customer.setAddress(add);

		em.persist(customer);
		em.getTransaction().commit();

		em.getTransaction().begin();
		System.out.println("Enter your Choice: ");
		System.out.println("1. You want to sell the car!");
		System.out.println("2. You want to buy the car!");
		int ch = sc.nextInt();
		if (ch == 1) {
			System.out.println("Please fill the all information!");
			System.out.print("Enter car model:");
			int cm = sc.nextInt();
			System.out.print("Enter car number:");
			int carno = sc.nextInt();
			System.out.print("Enter company name:");
			String com = sc.next();
			System.out.print("Enter car manufacture year:");
			int manyear = sc.nextInt();
			System.out.print("Enter the car buy year:");
			int year = sc.nextInt();
			System.out.print("Enter car owner name: ");
			String cowner = sc.next();
			System.out.print("Enter car selling price:");
			int sp = sc.nextInt();
			System.out.print("Enter contact number:");
			Long cn = sc.nextLong();

			Seller seller = new Seller();
			seller.setCarmodel(cm);
			seller.setCarnumber(carno);
			seller.setCarcompany(com);
			seller.setManufactureyear(manyear);
			seller.setYear(year);
			seller.setCarowner(cowner);
			seller.setSellingprice(sp);
			seller.setContactno(cn);

			em.persist(seller);

			em.getTransaction().commit();

			System.out.println(seller);
		}
		if (ch == 2) {
			Buyer buyer = new Buyer();
			buyer.setCarnumber(2512);
			buyer.setCarmodel(55555);
			buyer.setCarcompany("Tata");
			buyer.setSellingprice(85855);
			buyer.setYear(2010);

			Buyer buyer1 = new Buyer();
			buyer1.setCarnumber(2523);
			buyer1.setCarmodel(55545);
			buyer1.setCarcompany("Tata creta");
			buyer1.setSellingprice(858999);
			buyer1.setYear(2015);

			Buyer buyer2 = new Buyer();
			buyer2.setCarnumber(2534);
			buyer2.setCarmodel(55895);
			buyer2.setCarcompany("Tata neo");
			buyer2.setSellingprice(89425);
			buyer2.setYear(2017);

			em.persist(buyer);
			em.persist(buyer1);
			em.persist(buyer2);

			em.getTransaction().commit();
			
			System.out.println(buyer);
			System.out.println(buyer1);
			System.out.println(buyer2);
		}
		PurchaseDetails purdet = new PurchaseDetails();
		em.getTransaction().begin();
		purdet.setCarnumber(2510);
		purdet.setContactno(959550331L);
		
		em.persist(purdet);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
