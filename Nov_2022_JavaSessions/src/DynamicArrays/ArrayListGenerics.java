package DynamicArrays;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {

		
		ArrayList <Integer >numList=new ArrayList<Integer>();
		
		numList.add(100);
		numList.add(200);
		numList.add(500);
		numList.add(900);
		numList.add(1100);
		numList.add(1040);
		numList.add(1005);
		numList.add(1006);
		
		System.out.println(numList);
		
		// for each 
		
		for(Integer e:numList){
			
			System.out.println(e);
			
		}
		
		ArrayList <String> fruitsname=new ArrayList<String> ();
		
		fruitsname.add("apple");
		fruitsname.add("mango");
		fruitsname.add("beetroot");
		fruitsname.add("kale");
		fruitsname.add("kiwi");
		
		for(String s:fruitsname) {
			System.out.println(s);
		}
		
		ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("Tom");//0
		empDataList.add(2);//1
		empDataList.add(true);//2
		empDataList.add(12.33);//3
		empDataList.add('m');
		empDataList.add(30);
		
		System.out.println(empDataList.get(2));
		
		empDataList.remove(12.33);
		
	}

}
