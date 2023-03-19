package OOP_Constructors;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//calling another class 
		LoginPage lp1=new LoginPage("venky@123.com", "1244");
		
	    System.out.println(lp1.userName);
	    
	    System.out.println(lp1.password);
	    
	    
		LoginPage lp2=new LoginPage("kk@123.com", "12344");

		System.out.println(lp1);
	    
		
	}

}
