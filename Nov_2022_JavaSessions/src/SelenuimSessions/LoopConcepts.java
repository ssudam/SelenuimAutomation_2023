package SelenuimSessions;

public class LoopConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
//		int i=1;
//		while(i<5) {
//			System.out.println("I am Batman");
//			i++;
//		}
		
//		//2 
//		int i=0;
//		while(i<5) {
//			System.out.println("I am Batman");
//			i++;
//		}
		
		//3
//		int i=1;
//		while(i<10) {
//			System.out.println("I am Batman"+" " +i);
//			i++;
//		}
		
		//4 
		
//		int i=10;
//		while(i>=1) {
//			System.out.println(i);
//			i--;
//		}
//		
      //5
//		int i=0;
//		while(i<=10) {
//			System.out.println("Hello world");
//			i++;
//		}
		//6
//		int i=0;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		//7
//		int num=1;
//		
//		while(num<=100) {
//			if(num % 2 ==0) {
//				System.out.println(num);
//			}
//			num++;
//		}
		//8
//        int num=1;
//		
//		while(num<=100) {
//			if(num % 2 ==1) {
//				System.out.println(num);
//			}
//			num++;
//		}
		
		// 
		//char c='0';
		
//		for(int i=65;i<=90;i++) {
//			System.out.println("The ascii value of" +(char)i+ "=" +i);
//			//break;
//		}
		
	for(char c='a';c<='z';c++) {
		System.out.println(c);
	}
		
		
//		for(int i=97;i<=122;i++) {
//	    System.out.println("The ascii value of" +(char)i+ "=" +i);	
//		}
		
//		float f=1.0f;
//		while(f<=10.0) {
//			System.out.println(f);
//			f++;
//		}
		
//		int i=0;
//		while(i<=10) {
//			System.out.println(i);
//			if(i == 7) {
//			System.out.println("bye see you tommorrow");
//			break;
//			}
//			i++;
//		}
		
		///
//		for(int score=0;score<=100;score++) {
//			System.out.println(score);
//			if(score==0) {
//			
//				System.out.println("Zero - duck");
//			}
//			 if(score==25) {
//				System.out.println("good job");	
//			}
//			 if(score==50) {
//				 System.out.println("half century"); 
//			 }
//			 if(score==100) {
//				 System.out.println("full century");  	 
//			 }
//		}
	
	//
//	for (int i=5;i<=100;i++) {
//		if (i % 5==0) {
//			System.out.println(i);
//		}
//	}
		
	
	// 
	
	for(char c='a';c<='z';c++) {
		//System.out.println(c);
	
       switch (c) {
		case 'a':
			System.out.println(c+ " " +  "is a vowel");
			break;
			
		case 'e':
			System.out.println(c+ " " +  "is a vowel");
			break;
		case 'i':
			System.out.println(c+ " " +  "is a vowel");
			break;
		case 'o':
			System.out.println(c+ " " +  "is a vowel");
			break;
		case 'u':
			System.out.println(c+ " " +  "is a vowel");
			break;


		default:
			break;
		}
	}
	

	
	}

}
