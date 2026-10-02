package constructors;

public class Employee {

    String name;
    int id;
    double salary;

    // 1. No-Argument Constructor
    Employee() {
        name = "Unknown";
        id = 0;
        salary = 0;
    }

    // 2. Parameterized Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // 3. Constructor Overloading
    Employee(String name) {
        this.name = name;
        this.id = 0;
        this.salary = 0;
    }

    // 4. Copy Constructor
    Employee(Employee e) {
        this.name = e.name;
        this.id = e.id;
        this.salary = e.salary;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {

        // No-Argument Constructor
        Employee e1 = new Employee();

        // Parameterized Constructor
        Employee e2 = new Employee("Himaja", 101, 50000);

        // Constructor Overloading - one parameter
        Employee e3 = new Employee("Rahul");

        // Copy Constructor
        Employee e4 = new Employee(e2);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}