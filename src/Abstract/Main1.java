package Abstract;

interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}