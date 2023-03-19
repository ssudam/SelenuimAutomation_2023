package SelenuimSessions;

public class EvenOdd {
	
	public int Numberisevenorodd(int num) {
		
		if (num%2==0) {
			System.out.println(" number is even");
		}
		
		else {
			System.out.println("number is odd");
		}
		
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EvenOdd eo=new EvenOdd();
		int k=eo.Numberisevenorodd(13);
        System.out.println(k);
	}

}
