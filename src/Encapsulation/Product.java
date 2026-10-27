package Encapsulation;

import java.util.Scanner;

public class Product {

    // Private variables
    private String productName;
    private double price;
    private int quantity;

    // Setter method
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter method
    public String getProductName() {
        return productName;
    }

    // Setter method
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    // Getter method
    public double getPrice() {
        return price;
    }

    // Setter method
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    // Getter method
    public int getQuantity() {
        return quantity;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Object creation
        Product p = new Product();

        System.out.println("Enter a product name");
        String name = sc.nextLine();

        System.out.println("Enter a price");
        double price = sc.nextDouble();

        System.out.println("Enter a quantity");
        int quantity = sc.nextInt();

        // Values are stored using setter methods
        p.setProductName(name);
        p.setPrice(price);
        p.setQuantity(quantity);

        // Display details
        System.out.println("\nProduct Details");

        System.out.println("Name: " + p.getProductName());
        System.out.println("Price: " + p.getPrice());
        System.out.println("Quantity: " + p.getQuantity());

        sc.close();
    }
}