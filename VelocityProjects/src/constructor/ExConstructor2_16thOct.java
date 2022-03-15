package constructor;

public class ExConstructor2_16thOct {

	
	
		int a;							// declaration
		int b;
		
		
		ExConstructor2_16thOct()   		// This is a non Parameterized Constructor type
	
	{ 
		System.out.println("Initializing the variables");
		a = 3;			// initialization
		b = 4;
		
		// usage
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {

		// ExConstructor2_16thOct rdx = new ExConstructor2_16thOct();	 		// 1st way to call constructor.This is non Static Method
		   new ExConstructor2_16thOct();										// 2nd way to call constructor
		
	}
}
