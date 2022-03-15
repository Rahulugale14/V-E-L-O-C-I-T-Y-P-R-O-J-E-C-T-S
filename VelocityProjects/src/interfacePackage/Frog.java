package interfacePackage;

public class Frog implements AquaticAnimal, TerrestrialAnimal {

	public void lives()
	{
		System.out.println("Frog lives on both");
	}
	
	public static void main(String[] args) {
		
		Frog f = new Frog();
		f.lives();

	}

}
