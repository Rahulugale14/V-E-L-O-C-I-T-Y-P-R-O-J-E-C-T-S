package interfacePackage;

public class Kitchen implements Tubelight {

	@Override
	public void tubeLightInHall() 
	{
		System.out.println("Hall light is Off");
	}

	@Override
	public void tubeLightInKitchen() 
	{
		System.out.println("Here the programming code is present" + ""
				+ " in tubelight sensor by the developers... AND Kitchen light is On");	
	}
	
}
