package Interface;

public  interface  USMedical extends WHO,USHG{

	
    public void cardioServices();
	
	public void neuroServices();

	public void physioServices();

	public void emergencyServices();
	
	// who parent interface
	@Override  
	public void covidVaccination();
}
