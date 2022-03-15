package logicalProgramming;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 153;									// here, try using 4 digit Armstrong number
		int temp;
		int rev = 0;
		int Arms = num;
		
		while (num>0)
		{
			temp = num%10;
			rev = rev+temp*temp*temp;					// for 4 digits, use: rev+temp*temp*temp*temp
			num = num/10;
		}
		
		// System.out.print(rev);
		
		if (Arms == rev)		
		{
			System.out.println(rev + " is an Armstrong Number");
		}
		
		else
		{
			System.out.println(rev + " is not an Armstrong Number");
		}
	}

}
