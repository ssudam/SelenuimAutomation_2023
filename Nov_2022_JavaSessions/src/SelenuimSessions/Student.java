package SelenuimSessions;

public class Student {
	
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting student marks for :"+studentName);
		
		int marks=-1; // just declaring variable
		
		if(studentName.equals("sanjana")) {
			//return 100;
			marks=100;
			
		}
		else if(studentName.equals("neha")) {
			//return 50;
			marks=50;
			
		}
       else if(studentName.equals("venky")) {
    	   //return 90;
    	   marks=90;
			
		}
       else {
    	   System.out.println("student not found");
    	   //return -1;
       }
		
		return marks; // gives latest markets
		
	}

	public static void main(String[] args) {
		
		Student obj=new Student();
		
		int m=obj.getStudentMarks("neha");
		System.out.println(m);
		//System.out.println(obj.getStudentMarks("sanjana"));
		
		if(m==-1) {
			System.out.println("no need of marks sheet");
			
		}
		else {
			System.out.println("need marksheet");

		}
		
		
		

	}

}
