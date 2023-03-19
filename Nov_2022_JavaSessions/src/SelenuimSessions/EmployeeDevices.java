package SelenuimSessions;

public class EmployeeDevices {
	
	
	public String[] getEmployeeDevices(String empName) {
		
		System.out.println("getting devices information for employee: " + empName);
		//String devices1[]= {"khjh"};
		
		boolean flag =true;

		if (empName.equals("Ravi")) {
			String devices[] = { "macbook pro", "ipad", "iph13" };
			
			//return devices;
		}

		else if (empName.equals("Om")) {
			String devices[] = { "windows 10", "samsung s10" };
			//return devices;
		}

		else if (empName.equals("Rashmi")) {
			String devices[] = { "windows 10", "samsung s11", "iphone13", "Airtel SIM" };
			//return devices;
		}

		else {
			System.out.println("emp name is not found....");
		    flag =false;
		}
		
		//return empName;
		
		
	}

	public static void main(String[] args) {
		
		EmployeeDevices obj = new EmployeeDevices();
//		String d[] = obj.getEmployeeDevices("Tom");
//		System.out.println(Arrays.toString(d));
//		System.out.println(d.length);

	}

}

