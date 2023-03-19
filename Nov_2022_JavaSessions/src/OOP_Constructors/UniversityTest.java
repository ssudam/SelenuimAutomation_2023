package OOP_Constructors;

import java.util.Arrays;

public class UniversityTest {
	
	public static void main(String[] args) {
		String Courses[]= {"english","hindi","french"};

		
		University u=new University("Sanjana", "USA", "10-10-2022", Courses);
		
		System.out.println("details are :" +u.getName() +" "+u.getCountrt() +" "+u.getEstablishedDate()+" "+Arrays.toString(u.getCourses()));
		
	}

}
