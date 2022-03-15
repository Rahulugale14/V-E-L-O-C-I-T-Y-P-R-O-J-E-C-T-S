package operators;

public class Loical_Bitwise_OR {

	// 1) Logical OR (||)
	// 		Doesn't check second condition if first is true.
	// 		Checks second condition when first is false.
	
	// 2) Bitwise OR (|)
	// 		This operator always check both the conditions whether first is true or false.
	
	public static void main(String[] args) {
		
			int a = 50;
			int b = 100;
			int c = 500;
			
		System.out.println("---------- Logical OR ----------");
		System.out.println(a<b || b<c);			// true --- true ----> true
		System.out.println(a<b || b>c);			// true --- false ----> true
		System.out.println(a>b || c>a);			// false --- true ----> true
		System.out.println(a>b || c<b);			// false --- false ----> false
		
		System.out.println("---------- Bitwise OR ----------");
		System.out.println(a<b | b<c);			// true --- true ----> true
		System.out.println(a<b | b>c);			// true --- false ----> true
		System.out.println(a>b | c>a);			// false --- true ----> true
		System.out.println(a>b | c<b);			// false --- false ----> false
		

	}

}
