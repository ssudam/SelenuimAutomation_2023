package SelenuimSessions;

public class Sum {

	public int Addtwonumbers( int a,int b) {
		
		int c=a+b;
		return c;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum obj=new Sum();
		
		int a= obj.Addtwonumbers(10, 20);
		
		System.out.println(a);
	}

}
