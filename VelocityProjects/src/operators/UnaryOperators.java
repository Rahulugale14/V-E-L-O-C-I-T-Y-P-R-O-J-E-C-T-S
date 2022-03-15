package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		
		
			int a =10;								// incremental postfix
			System.out.println(a);											
			System.out.println(a++);				// 10 -------> 11
			System.out.println(a);			
			System.out.println(a++ +"\n");			// 11 -------> 12
			
			
			int b =10;								// decremental postfix
			System.out.println(b);					// 10
			System.out.println(b--);				// 10 -------> 9
			System.out.println(b);					// 9
			System.out.println(b-- +"\n");			// 9
			
			
			int c = 20;								// prefix incremental
			System.out.println(c);					// 20
			System.out.println(++c);				// 21
			System.out.println(c + "\n");			// 21
			
			
			int d = 30;								// prefix decremental
			System.out.println(d);					// 30
			System.out.println(--d);				// 29
			System.out.println(d +"\n");			// 29
			
			
			
			// inverting the value of boolean
			
			boolean s = true;
			System.out.println(s);			// true
			System.out.println(!s);			// false
						
	}

}
