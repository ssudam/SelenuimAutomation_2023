package SelenuimSessions;

public class TestBrowser {
	
	
	//public Boolean launchBrowser(String browsername) {
//		
//		System.out.println(" the name of the browser :" + " = " +browsername);
//		boolean flag=true;
//		
//		switch (browsername.toLowerCase().trim()) {
//		case "chrome":
//			System.out.println(" chrome is launched");
//			flag=true;
//			
//			break;
//			
//		case "edge":
//			System.out.println(" edge is launched");
//			flag=true;
//			
//			break;
//			
//		case "firefox":
//			System.out.println(" firefox is launched");
//			flag=true;
//			
//			break;
//			
//		case "safari":
//			System.out.println(" safari is launched");
//			flag=true;
//			
//			break;
//
//         default:
// 			System.out.println(" browser not found");
// 			//flag=false;
//            break;
//		}
//		return flag;
//		
//		
//	}
		
		public Boolean launchBrowseragain(String browsername) {
			
			System.out.println(" the name of the browser :" + " = " +browsername);
			//boolean flag=true;
			
			boolean flag=false;
			
			String m=browsername.toLowerCase().trim();
			
			if(m.equals("chrome")) {
				System.out.println("chrome is launched");
				flag=true;
			}
			else if(m.equals("edge")) {
				System.out.println("edge is launched");
				flag=true;
			}
			else if(m.equals("firefox")) {
				System.out.println("firefox is launched");
				flag=true;
			}
			else if(m.equals("safari")) {
				System.out.println("safari is launched");
				flag=true;
			}
			else {
				System.out.println("browser not found");
				//flag=false;
			}
			return flag;
			
		
		}
			
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestBrowser obj= new TestBrowser();
		
//	Boolean s=obj.launchBrowser("chrome");
////		
////		System.out.println(s);
//		
////		if(obj.launchBrowser("ie")) {
////			System.out.println("launch the url");
////			
////		}
////		else {
//			System.out.println("browser failed");
//
//		}
		
		
			if(obj.launchBrowseragain("ie")) {
				System.out.println("launch the url");
							}
			else {
				System.out.println("browser failed");

			}


	}

}
