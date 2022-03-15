package scannerPackage;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter your first number");

		int a = s1.nextInt();
		
		System.out.println("Please enter your second number");
		int b = s1.nextInt();
		
		int c = a + b;
		System.out.println("Addition of two numbers: " + c);
	}

}
