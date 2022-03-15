package interfacePackage;

public class MyRoomChoice {

	public static void main(String[] args) {
		// Testing my light sensors given by my friend
		
		System.out.println("I'm now entering in the Hall");
		
		Hall h = new Hall();					// here, I can also type - "Tubelight t = new Hall()"
		h.tubeLightInHall();
		h.tubeLightInKitchen();
		
		
		System.out.println(" -------------------------------------- ");
		
		
		System.out.println("I'm now entering in the Kitchen");
		
		Kitchen k = new Kitchen();			// here, I can also type - "Tubelight t = new Kitchen"
		k.tubeLightInKitchen();
		k.tubeLightInHall();

	}

}
