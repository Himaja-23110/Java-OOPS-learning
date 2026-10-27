// Multilevel Inheritance//
package Inheritance;

public class Animal {

    String name;

    void eat() {
        System.out.println("Animal is eating");
    }

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.name = "Junnu";

        System.out.println("Name: " + p.name);

        p.eat();
        p.bark();
        p.play();
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {

    void play() {
        System.out.println("Puppy is playing");
    }
}
