package SelenuimSessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i[] = new int[4];
		System.out.println(i.length);
		int len = i.length;
		int hi = len - 1;
		int li = 0;
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50; // AIOB
		
		System.out.println(i[0]);
		//System.out.println(i[4]);
		System.out.println("-------");
		
		// for loop is index based loop
		for(int k=0;k<=i.length-1;k++) {
			System.out.println(i[k]);
		}
		
		System.out.println("------");
		
		System.out.println(Arrays.toString(i));
		
		//foreach
		
		for(int k:i) {
			System.out.println(k);
			if(k==30) {
				System.out.println("hi 30");
				break;
			}
		}
		System.out.println("------");

		
		int s[]=new int[3];
		
		s[2]=20;
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		//
		
		// Object Array:
				// Object is a class in Java -- is a super class of all the classes in Java

				// Emp Info: Name(String) , age(int), salary(double), gender(char),
				// isPermanent(boolean):
				Object emp[] = new Object[5];
				emp[0] = "Rashmi";
				emp[1] = 25;
				emp[2] = 25.55;
				emp[3] = 'f';
				emp[4] = true;

				System.out.println(emp.length);
				for (Object e : emp) {
					System.out.println(e);
					if (e.equals("Rashmi")) {
						System.out.println("emp is from QA");
					}
				}
				
		System.out.println("----------------");		
		String fruits[]= {"apple","mango","orange","pineapple","mango"};
		
		//System.out.println(Arrays.toString(fruits));
		
		System.out.println("----------------");
		for(int m=0;m<=fruits.length-1;m++) {
			System.out.println(m);
			if(fruits[m].equals("mango")) {
				System.out.println("hey you love mango");
				//break;
			}
			break;
		}
	}

}
