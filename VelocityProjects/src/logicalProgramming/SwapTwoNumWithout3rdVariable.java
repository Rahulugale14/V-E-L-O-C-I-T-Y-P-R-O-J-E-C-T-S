package logicalProgramming;

public class SwapTwoNumWithout3rdVariable {

	public static void main (String [] args) {
		
		int a = 20;
		int b = 10;
		System.out.println("Before Swapping: " + a + " " + b);
		
		a = a + b;					// here, a = 20 + 10 = 30
		b = a - b;					// here, b = 30 - 10 = 20
		a = a - b;					// here, a = 30 - 20 = 10
		
		System.out.println("After Swapping: " + a + " " + b);
	}
	
}
