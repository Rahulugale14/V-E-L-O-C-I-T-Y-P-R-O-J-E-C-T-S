package polymorphism;

public class Ex2_MethodOverriding2 extends EX2_MethodOverriding1 {

	
	public void eat ()
	{
		System.out.println("I am eating Idli Sambar");
	}
	
	public void play ()
	{
		System.out.println("I am playing GTA Vice City");
	}
	
	public static void main(String[] args) {
		
		Ex2_MethodOverriding2 M2 = new Ex2_MethodOverriding2();
		M2.eat();
		M2.play();
		
		EX2_MethodOverriding1 M1 = new EX2_MethodOverriding1();
		M1.eat();
		M1.play();
	}

}
