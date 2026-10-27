//Hierarchical Inheritance//
package Inheritance;

public class Vehicle {

    String brand;
    int speed;

    void start() {
        System.out.println("Vehicle is starting");
    }

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.brand = "Suzuki";
        c1.speed = 60;

        System.out.println("Car Brand: " + c1.brand);
        System.out.println("Car Speed: " + c1.speed + " km/h");

        c1.start();
        c1.drive();

        System.out.println();

        Bike b1 = new Bike();

        b1.brand = "Yamaha";
        b1.speed = 80;

        System.out.println("Bike Brand: " + b1.brand);
        System.out.println("Bike Speed: " + b1.speed + " km/h");

        b1.start();
        b1.ride();
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {

    void ride() {
        System.out.println("Bike is riding");
    }
}