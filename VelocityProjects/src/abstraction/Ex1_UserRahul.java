package abstraction;

public class Ex1_UserRahul {

	public void toGoAirportbyCar()
	{
		System.out.println("Want to use a car to go to the Airport");
		
		Ex1_Fuel f = new Ex1_Car(); 				// Abstract class ObRefVar = new Concrete class
		f.petrol();
		f.ready();
	}
	
	public void flyAeroplane()
	{
		System.out.println("Now, I'll fly the plane");
		
		Ex1_Fuel f1 = new Ex1_Aeroplane();				// Abstract class ObRefVar = new Concrete class
		f1.petrol();
		f1.ready();
	}
	
}
