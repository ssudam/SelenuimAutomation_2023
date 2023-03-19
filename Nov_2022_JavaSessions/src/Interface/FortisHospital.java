package Interface;

public class FortisHospital extends Hospital implements USMedical,UKMedical,IndianMedical{
//US
	@Override
	public void cardioServices() {
		// TODO Auto-generated method stub
		
		System.out.println("FH - cardioServices");
		
	}

	@Override
	public void neuroServices() {
		// TODO Auto-generated method stub
		System.out.println("FH - neuroServices");

		
	}

	@Override
	public void physioServices() {
		System.out.println("FH - physioServices");

		
		
	}
	//uk

	@Override
	public void entServices() {
		// TODO Auto-generated method stub
		
		System.out.println("FH - entServices");

		
	}

	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		System.out.println("FH - dentalServices");

		
	}
	
	//Ind

	@Override
	public void oncologyServices() {
		// TODO Auto-generated method stub
		System.out.println("FH - oncologyServices");

		
	}

	@Override
	public void gynicServices() {
		// TODO Auto-generated method stub
		System.out.println("FH - gynicServices");

		
	}

	@Override
	public void orthoServices() {
		// TODO Auto-generated method stub
		System.out.println("FH - orthoServices");

		
	}
	
	//individual methods

	public void medicalTraining() {
		
		System.out.println("FH - medicalTraining");

		
	}
	
	public void medicalInsurance() {
		System.out.println("FH - medicalInsurance");

		
	}
	

	
// common method in all interfaces
	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		System.out.println("FH- emergency services");
		
	}

	
	// WHO 
	@Override
	public void covidVaccination() {
		System.out.println("FH- covidVaccination");
		
	}

	
	//USHG
	@Override
	public void childCareServices() {
		// TODO Auto-generated method stub
		
	}
	
	

}
