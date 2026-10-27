// Single inheritance//
package Inheritance;
public class Smartphone {

    String brand;
    int price;

    void call() {
        System.out.println("Smartphone is making a call");
    }

    public static void main(String[] args) {

        AndroidPhone a = new AndroidPhone();

        a.brand = "Samsung";
        a.price = 30000;

        System.out.println("Brand: " + a.brand);
        System.out.println("Price: " + a.price);

        a.call();
        a.playStore();
    }
}

class AndroidPhone extends Smartphone {

    void playStore() {
        System.out.println("Android phone has Play Store");
    }
}