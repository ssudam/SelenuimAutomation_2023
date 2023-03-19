package Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee e=new Employee();
		e.setName("sanjana");
		
		e.setAge(28);
		
		e.setSalary(123.78);
		
		e.setActive(true);
		e.setGender("F");
		
		System.out.println(e.getAge());
		
		System.out.println(e.getEmployeeinfo());
	}

}
