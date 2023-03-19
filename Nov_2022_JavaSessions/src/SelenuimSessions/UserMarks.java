package SelenuimSessions;

public class UserMarks {

	public void display(int i) {

		 if (i>90 && i<=100) {

		 System.out.println("Grade will be AA");

		         

		                 else if(i>80 && i<=90) {

		 System.out.println("Grade will be AB");

		                 }

		        

		 else if(i>70 && i<=80) {

		 System.out.println("Grade will be BB");

		                 }

		         else if(i>60 && i<=70) {

		 System.out.println("Grade will be BC");

		                 } 

		        else if(i>50 && i<=60) {

	 System.out.println("Grade will be CD");

		                 }

		         else if(i>40 && i<=50) {

		System.out.println("Grade will be DD");

		                 }

		                 else {

		                  System.out.println("Fail");

		                 }

		        }
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		UserMarks m=new UserMarks();

		m.display(67);

		m.display(83);

		m.display(77);

		 m.display(57);

		// m.display(47);  
		
	}

}
