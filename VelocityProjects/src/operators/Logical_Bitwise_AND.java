package operators;

public class Logical_Bitwise_AND {

	
	// 1) Logical AND (&&)
	//    It doesn't check second condition if first condition is false.
	//	  It checks second condition only when first condition is true.
	
	// 2) Bitwise AND (&)
	//    Bitwise and operator always check both the conditions whether first condition is true or false.
	
	public static void main(String[] args ){
		
			// Logical AND (&&)
		System.out.println("---------- Logical AND ----------");
		int a = 10;			
		int b = 20;
		System.out.println(a > b && b < a);			// false -- false ---> false
		System.out.println(a < b && b > a);			// true -- true ---> true
		System.out.println(a < b && b < a);			// true -- false ---> false
		
			// Bitwise AND (&)
		System.out.println("---------- Bitwise AND ----------");
		
		System.out.println(a > b & b < a);			// false -- false ---> false
		System.out.println(a < b & b < a);			// true -- false ---> false
		System.out.println(a < b & b > a);			// true --- true ----> true
	}

}
