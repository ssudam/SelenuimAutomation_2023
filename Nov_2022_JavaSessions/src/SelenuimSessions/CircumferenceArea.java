package SelenuimSessions;

public class CircumferenceArea {

	public  double Circlecircum(double r) {
		
		double circum=2*r*3.14;
		
		return circum;
	}
	
	public double AreaofCircle(double r) {
		
		double area=3.14*r*r;
		
		return area;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircumferenceArea ca= new CircumferenceArea();
		
		double l=ca.Circlecircum(100.12);
		
		double k=ca.AreaofCircle(20);
		
		System.out.println("circumferenbce of circle is "  +l +" " + "Area of circle "   +k);
	
	}

}
