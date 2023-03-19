package StringManupulation;

import java.util.Arrays;

public class Strings {
	
	public static void main(String args[]) {
		
		// indexing starts from 0 
		// total length is 24 so len -1 
		
		String str="Hi I am in charlotte now";
		
		System.out.println(str.length());
		
		int len= str.length();
		
		int li=0;
		int hi=len-1;
		
		System.out.println(hi);
		
		System.out.println(str.charAt(5));
		//System.out.println(str.charAt(24)); // SIOB
		
		System.out.println(str.indexOf('c'));
		System.out.println(str.indexOf("charlotte"));
		System.out.println(str.indexOf("now"));
		System.out.println(str.indexOf("java")); // invalid
		
		String s1="Automation java";
		
		if(s1.indexOf("java")==8) {
			System.out.println("correct value");
			
		}
		else {
			System.out.println("wrong value");

		}
		
		System.out.println(str.indexOf("python"));
		
		String m2="product name is macbook";
		
		// means index of macbook is not equal to -1
		//16!=-1
		
		if(m2.indexOf("macbook")!=-1) {
			
		}
		
		String k="netflix amazon prime";
		System.out.println(k.toUpperCase());
		System.out.println(k.toLowerCase());
		
		//trim
		
		String v="     hello venkatesh    ";
		System.out.println(v.trim());
		
		//replace
		
		String p1="hello world";
		System.out.println(p1.replace(" ", ""));
		
		//replace
		
		String p2="hello atlanta";
		System.out.println(p2.replace("atlanta", "charlotte"));

		//equals
		String e1="hello selenuim";
		String e2="hello Selenuim";
		System.out.println(e1.equals(e2));
		
		//equalsignorecase
		System.out.println(e1.equalsIgnoreCase(e2.trim()));
		
		//Split
		
		String lang="JAVA_PYTHON_C_DOTNET";
		String l[]=lang.split("_");
		
		System.out.println(l.length);
		System.out.println(Arrays.toString(l));
		
		System.out.println(l[0]);
		



		

	}

}
