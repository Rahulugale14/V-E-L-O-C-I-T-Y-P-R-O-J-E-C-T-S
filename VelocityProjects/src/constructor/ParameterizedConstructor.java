package constructor;

public class ParameterizedConstructor {

		// In this type, number of arguments should be different
		// Type of arguments should be different
		// Sequence of arguments should be different
	
	ParameterizedConstructor(double d)
	{
		System.out.println("1 Argument Constructor with type double");
	}
	
	ParameterizedConstructor(int a)
	{
		System.out.println("1 Argument Constructor with type int");
	}
	
	ParameterizedConstructor(int a, String s1)
	{
		System.out.println("1 Argument Constructor with type int and String");
	}
	
	ParameterizedConstructor(String s1, int a)
	{
		System.out.println("1 Argument Constructor with type String and int");
	}
	ParameterizedConstructor(String s3)
	{
		System.out.println("1 Argument Constructor with type String");
	}
	
	public static void main(String[] args) {
		
			// ParameterizedConstructor rdx = new ParameterizedConstructor(14.20);
			new ParameterizedConstructor(14.20);
			new ParameterizedConstructor(1420);
			new ParameterizedConstructor(2002, "India");
			new ParameterizedConstructor("Maharashtra", 2002);
			new ParameterizedConstructor("This is a Parameterized Constructor");
	}

}
