package SelenuimSessions;

public class Employee {
	
	// class variables
	
	String name;
	int age;
	String city;
	double salary;


	public static void main(String[] args) {

		// create the object of the class:
		// using new keyword
		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age = 25;
		e1.city = "LA";
		e1.salary = 12.33;

		System.out.println(e1.name + " " + e1.age + " " + e1.city + " " + e1.salary);

// s is reference name 
// new employee is the object created

		
		Employee s=new Employee();
		// Didn't assign any any values to s so the object takes default values
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.salary);
		
		Employee e3=new Employee();
		
		e3=null ; // null reference object 
		
		//e3.name="sanjana"; // null pointer exception
		
		// object without references - No ref object
		// it moves to GC JVM sends a request to GC
	
		new Employee().name = "Naveen";
		new Employee().age = 25;
		new Employee().salary = 12.33;
		new Employee().city = "Pune";
		
		System.gc();
	}

}
