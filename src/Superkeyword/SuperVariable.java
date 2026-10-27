package Superkeyword;

public class SuperVariable {

    // Parent class variable
    String name = "Ravi";

    public static void main(String[] args) {

        // Creating object of Child class
        Student s = new Student();

        // Calling child class method
        s.showNames();
    }
}

// Child class
class Student extends SuperVariable {

    // Child class has the same variable name
    String name = "Himaja";

    void showNames() {

        // 'name' refers to the child class variable
        System.out.println("Student Name: " + name);

        // 'super.name' refers to the parent class variable
        System.out.println("Parent Name: " + super.name);
    }
}