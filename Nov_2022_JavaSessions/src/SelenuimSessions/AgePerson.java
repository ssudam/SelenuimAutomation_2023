package SelenuimSessions;

public class AgePerson {

	
	public int elligiblevote(int num) {
		
		if(num>=18) {
			
			System.out.println("oh yes you are elligible to vote this year");
		}
		
		else {
			System.out.println("sorry you are not elligible");
		}
		
		return num;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AgePerson obj=new AgePerson();
		
		int k=obj.elligiblevote(14);
		
		System.out.println(k);

	}

}
