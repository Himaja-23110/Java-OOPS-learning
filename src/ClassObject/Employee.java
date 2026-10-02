package ClassObject;

public class Employee {
	String name;
	int id;
	double salary;
	void displayDetails() {
		System.out.println("Name: "+ name);
		System.out.println("ID: "+ id);
		System.out.println("salary: "+ salary);
	}
	public static void main(String [] args) {
		Employee e1 = new Employee();
		Employee  e2 = new Employee();
		e1.name = "Geetha";
		e2.name = "sravya";
		e1.id = 101;
		e2.id = 102;
		e1.salary = 50000;
		e2.salary = 30000;
		e1.displayDetails();
		e2.displayDetails();
	}

}
