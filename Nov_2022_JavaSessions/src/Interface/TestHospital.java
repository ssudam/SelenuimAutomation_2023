package Interface;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FortisHospital fh =new FortisHospital();
		
		fh.cardioServices();
		fh.dentalServices();
		fh.entServices();
		fh.gynicServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		fh.neuroServices();
		
		fh.emergencyServices();
		fh.covidVaccination();
		
		//USMedical us = new USMedical(); // NA
		
		// top casting
	// parent interface       // child class
		USMedical us =new FortisHospital();
        us.cardioServices();
        us.neuroServices();
        us.physioServices();
        us.emergencyServices();
        fh.medicalNews();
        fh.medicalRD();
        
		UKMedical uk =new FortisHospital();
		
		uk.dentalServices();
		uk.entServices();
		uk.emergencyServices();
		
		
		//getting only those methods from medical
		IndianMedical in =new FortisHospital();
		in.oncologyServices();
		in.orthoServices();
		in.gynicServices();
		in.emergencyServices();

      
	}

}
