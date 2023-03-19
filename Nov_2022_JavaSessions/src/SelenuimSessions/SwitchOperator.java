package SelenuimSessions;

public class SwitchOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String browser="edge";
		
		switch (browser) {
		case "chrome":
			System.out.println("chrome is launched");
			
			break;
			case "firefox":
				System.out.println("ff is launched");
				
				break;
			case "edge":
				System.out.println("edge is launched");
				//break;


		default:
			System.out.println("invalid browser");
			//break;
		}

	}

}
