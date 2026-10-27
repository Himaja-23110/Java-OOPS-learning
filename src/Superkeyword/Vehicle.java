package Superkeyword;

public class Vehicle {
	//parent class variable//
	String name = "Vehicle";
	String color = "White";
	public static void main(String [] args) {
	// Creating object of Child class
		Car c = new Car();
		String Color = "Black";
		// Calling child class method
		c.showNames();
	}
}
//child class//
class Car extends Vehicle {
	String name = "Car";
	String Color = "Black";
	
	 void showNames() {
		  // Accessing child class variables
	        System.out.println("Child Name: " + name);
	        System.out.println("Child Color: " + color);

	        // Accessing parent class variables using super
	        System.out.println("Parent Name: " + super.name);
	        System.out.println("Parent Color: " + super.color);
	 }
}