package polymorphism;

public class MainMethodOverload {

	public static void main(int a)
	{
		System.out.println("I am in the main method");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("I am in the main method to overload it");
		main(14);

	}

}
