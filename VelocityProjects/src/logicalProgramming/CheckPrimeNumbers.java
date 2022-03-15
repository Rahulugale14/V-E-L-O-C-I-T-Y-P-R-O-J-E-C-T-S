package logicalProgramming;

public class CheckPrimeNumbers {

	public static void main(String[] args) {
		
		int a = 11;							// try using "a = 10"
		int flag = 0;
		
		for (int i = 2; i<=a-1; i++)
		
		{
			if (a%i == 0)					// here, it is 11%2
			{
				flag = 0;					// take flag = 0 or 1
			}
		}
		
		if (flag == 0)
		{
			System.out.println(a + " is a prime number");
		}

		else
		{
			System.out.println(a + " is not a prime number");
		}
	}

}
