package OOP_Constructors;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1=new Car("Audi", 110);
		
		Car c2= new Car("Honda", 80, false);
		
		Car c3= new Car("Bmw", 89);
		
        Car c4 = new Car("Tesla", "Black", 90, true);
		
		
		
		
		
		
		//fetching the data for the car:
		//GET - 
		System.out.println(c1.name +  " " + c1.color + " " + c1.price + " " + c1.isAutomatic);
		
		System.out.println(c4.name +  " " + c4.color + " " + c4.price + " " + c4.isAutomatic);

	}

}
