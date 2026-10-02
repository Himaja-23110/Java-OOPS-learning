package constructors;

public class Student {

    String name;
    int id;
    String course;

    // No-Argument Constructor
    Student() {
        name = "Chitti";
        id = 110;
        course = "CSE";
    }

    // Parameterized Constructor
    Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    // Parameterized Constructor - Overloading
    Student(String name) {
        this.name = name;
        this.id = 0;
        this.course = "Unknown";
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.course = s.course;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Himaja", 101, "CSE");
        Student s3 = new Student("Rahul");
        Student s4 = new Student(s2);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}