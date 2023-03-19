package Inheritance;

public class TestHospital {

	public static void main(String[] args) {

		
		
		Apollo a=new Apollo();
		
		a.addPatients();
		a.doctorName();
		
		
	Fortis f=new Fortis();
		
	    f.addPatients();
		f.doctorName();
	
		
		System.out.println("------------------");
	
     Hospital h1=new Hospital();
     h1.addPatients();
     h1.doctorName();
    
     
     System.out.println("-------Max");
     Max m=new Max();
     m.addPatients();
     m.doctorName();
     m.getprescription();
     
     // Top casting 
     
     System.out.println("-------top casting");
     
     Hospital h=new Apollo();
     h.addPatients();
     h.doctorName();
     h.registername();
Hospital.doctorSpeciality();     
     

	
	}	

}
