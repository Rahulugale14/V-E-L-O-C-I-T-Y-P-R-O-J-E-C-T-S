package logicalProgramming;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// using 3rd variable
		
		int a = 10;
		int b = 20;
		int c;
		
		System.out.println("Before Swapping: " + a + " " + b);
		c = b;
		b = a;
		a = c;
		
		System.out.println("After Swapping: " + a + " " + b);

	}

}
