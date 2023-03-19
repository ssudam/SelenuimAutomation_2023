package OOP_Constructors;

public class LoginPage {
	
	//global variables
	String userName;
	String password;
	
	//constructor with parameters (local variables) - means assign values
	// restrict object creation
	// acts as setters
	
	public LoginPage(String userName,String password) {
		this.userName=userName;
		this.password=password;
		
	}
	
	public boolean doLogin() {
		System.out.println("enter username : " + userName);
		System.out.println("enter password : " + password);
		System.out.println("click on Login button");
		System.out.println("user is logged in");
		return true;
		
	}
	
	public void resetPassword() {
		System.out.println("your reset password:" +password);
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
