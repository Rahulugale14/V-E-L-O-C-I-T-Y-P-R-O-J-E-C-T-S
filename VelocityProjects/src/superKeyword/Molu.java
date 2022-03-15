package superKeyword;

public class Molu extends Golu {

	public void age()
	{
		super.age();
		System.out.println("Molu's age is 60 years");
	}
	
	
	public static void main(String[] args) {
		
		Molu m = new Molu();
		m.age();

	}

}
