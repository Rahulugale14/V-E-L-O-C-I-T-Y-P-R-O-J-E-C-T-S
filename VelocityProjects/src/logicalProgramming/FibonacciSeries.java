package logicalProgramming;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		System.out.println("Printing Fibonacci series less than 20:");
		
		int a =0;
		int b = 1;
		int c = 0;
				
		System.out.print(a + " " + b);
		
		while(c<20)								// 0 < 20
		{
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
		}

	}

}
