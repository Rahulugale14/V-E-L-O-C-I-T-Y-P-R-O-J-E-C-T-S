package operators;

public class ShiftOperator {

	public static void main(String[] args) {
		
			// rightshift ( >> )
			
		
		int a = 50;
		System.out.println(a>>2); 		// 50/2^2  ------ Here the output value is 12 because it is the "Quotient Value".
		System.out.println(a>>3); 		// 50/2^3  ------ Here the output value is 6 because it is the "Quotient Value".
		
			// leftshift ( << )
		
		int b = 55;
		System.out.println(b<<7);	// 55 * 2^7 ---- Here the output is 7040 because it is multiplied by 2^7
														 
		
		
	}

}
