package Methodoverloading;

public class Display {
	void show(int number) {
		System.out.println(number);
	}
	void show(String text) {
        System.out.println(text);
    }

	public static void main(String[] args) {
	    Display d = new Display();
	    d.show(100);
	    d.show("Hello Java");
	}
		
	
}
