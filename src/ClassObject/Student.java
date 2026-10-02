package ClassObject;

public class Student{
	String name ;
	int age;
	String course;
    void displayDetails() {
    	System.out.println("Name: " + name);
    	System.out.println("Age: " + age);
    	System.out.println("Course: " + course);
    }
    public static void main(String [] args) {
    	Student s1 = new Student();
	    Student s2 = new Student();
	    s1.name = "Himaja";
	    s1.age = 21;
	    s1.course = "CSE";
	    s2.name = "Janu";
	    s2.age = 23;
	    s2.course = "IT";
	    s1.displayDetails();
	    s2.displayDetails();
    }
}