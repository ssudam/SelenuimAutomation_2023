package OOP_Constructors;

import java.util.Arrays;

public class TestBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String [] plugin = new String[2];
	
	plugin[0]="andriod";
	plugin [1]="mac";
	
	Browser obj=new Browser("chrome", 89.8, plugin);
	
	System.out.println(obj.getName());
	System.out.println(obj.getVersion());
	System.out.println(Arrays.toString(obj.getPlugin()));
	
	
	obj.setName("firefox");
	System.out.println(obj.getName());
	
	obj.setVersion(98.0);
	
	//obj.setPlugin({"khjh","hghgg"}); // how we can set string array again?
	
	

	}

}
