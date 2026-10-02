package ClassObject;

public class  Mobile{
	// class creation//
	//instance variables//
	String brand;
	String model;
	double price;
	//Method//
	void displayDetails() {
	    System.out.println("Brand: " + brand);
	    System.out.println("Model: " + model);
	    System.out.println("Price: " + price);
	}
	public static void main(String[] args) {
		//object creation//
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		//Assigning values//
		m1.brand = "Oppo";
		m1.model = "A15s";
		m1.price = 45000;
		m2.brand = "Samsung";
		m2.model = "S24";
		m2.price = 75000;
		//calling method//
		m1.displayDetails();
		m2.displayDetails();
	}
}
