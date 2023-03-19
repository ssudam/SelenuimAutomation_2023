package SelenuimSessions;

public class MethodOverloading {

	
	static String phone="2343529130";
//	String phone;
//	String password;
//	int otp;
//	String username;
	
	public boolean LoginTest(String phone,String password) {
	
		System.out.println("your details is "+MethodOverloading.phone+" "+password);
		
		return true;
		
	}
	
	public boolean LoginTestone(String phone,int otp) {
		
		System.out.println("your details is "+phone+" "+otp);
		
		return true;
		
	}
	
	public boolean LoginTesttwo(String username,String password) {
		
		System.out.println("your details is "+username+" "+password);
		
		return false;
	}
	
     public boolean LoginTestthree(String username,String password,int otp) {
		
		System.out.println("your details is "+username+" "+password+" "+otp);
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		
		boolean s=obj.LoginTest("phone", "test@123");
		
		System.out.println(s);
		
		boolean w=obj.LoginTesttwo("venky","123@syak");
		System.out.println(w);
		
		
		boolean x=obj.LoginTestthree("sanjnaa", "abc@1234", 1234);
		
		System.out.println(w);
		
		
		
		
	

	}

}
