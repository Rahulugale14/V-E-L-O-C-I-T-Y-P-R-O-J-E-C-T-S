package scannerPackage;

import java.util.Scanner;

public class FactorialScanner {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the number of which you want to see the factorial");
		
		int num = s1.nextInt();
		int fact = 1;
		
		for (int i = 1; i <= num; i++)
		{
			fact = fact * i;
		}
		
		System.out.println("Factorial of " + num + " is " + fact);
		
	}

}
