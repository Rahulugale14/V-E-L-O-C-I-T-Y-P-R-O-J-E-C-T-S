package logicalProgramming;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 123;					// here, try using "int num = 123456789"
		int temp;
		int rev = 0;
		
		while(num >0)
		{
			temp = num%10;
			rev = rev*10 + temp;
			num = num/10;
		}
		
		System.out.println(rev + " is the required reverse number");

	}

}
