package Encapsulation;

import java.util.Scanner;

public class Mobile {
	
	private String brand;
	private String model;
	private double price;
	private int storage;
	
	public void setbrand(String brand) {
		this.brand = brand;
	}
	public String getbrand() {
		return brand;
	}
	public void setmodel(String model) {
		this.model = model;
	}
	public String getmodel() {
		return model;
	}
	public void setprice(double price) {
		if(price > 0) {
			this.price = price;
		}
	}
	public double getprice() {
		return price;
	}
	public void setstorage(int storage) {
		if(storage > 0) {
			this.storage = storage;
		}
	}
	public int storage() {
		return storage;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Mobile m = new Mobile();
		 System.out.println("Enter a brand name");
	        String name = sc.nextLine();
	        
	        System.out.println("Enter a model");
	        String model = sc.nextLine();

	        System.out.println("Enter a price");
	        double price = sc.nextDouble();

	        System.out.println("Enter a storage");
	        int storage = sc.nextInt();

	        
	        m.setbrand(name);
	        m.setmodel(model);
	        m.setprice(price);
	        m.setstorage(storage);

	       
	        System.out.println("\n Mobile Details");

	        System.out.println("Name: " + m.getbrand());
	        System.out.println("Model: " + m.getmodel());
	        System.out.println("Price: " + m.getprice());
	        System.out.println("Storage: " + m.storage());

	        sc.close();
	}
}
