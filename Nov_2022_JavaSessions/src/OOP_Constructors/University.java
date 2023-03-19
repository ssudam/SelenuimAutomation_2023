package OOP_Constructors;

public class University {
	
	String name;
	String countrt;
	String establishedDate;
	String Courses[];
	
	//String Courses[]= {"english","hindi","french"};

	public University(String name, String countrt) {
		//super();
		this.name = name;
		this.countrt = countrt;
	}

	public University(String name, String countrt, String establishedDate) {
		
		this.name = name;
		this.countrt = countrt;
		this.establishedDate = establishedDate;
	}

	public University(String name, String countrt, String establishedDate, String[] courses) {
	
		this.name = name;
		this.countrt = countrt;
		this.establishedDate = establishedDate;
		Courses = courses;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public String getCountrt() {
		return countrt;
	}

//	public void setCountrt(String countrt) {
//		this.countrt = countrt;
//	}

	public String getEstablishedDate() {
		return establishedDate;
	}

//	public void setEstablishedDate(String establishedDate) {
//		this.establishedDate = establishedDate;
//	}

	public String[] getCourses() {
		return Courses;
	}

//	public void setCourses(String[] courses) {
//		Courses = courses;
//	}
	
	

}
