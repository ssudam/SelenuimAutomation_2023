package DynamicArrays;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		
		System.out.println(ar.size());
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		// arraylist - we will use ar.size to check len
		
		System.out.println(ar.size()); //0
		
		ar.add(true);
		//ar.add("test");
		ar.add(23.45);
		
		System.out.println(ar.size());//4
		
		//ar.remove(6);
		
		System.out.println(ar.size());//6

		
		System.out.println(ar.get(5));// 23.45
		
		// to print all the values
		
		System.out.println(ar);





		
		
		
	}

}
