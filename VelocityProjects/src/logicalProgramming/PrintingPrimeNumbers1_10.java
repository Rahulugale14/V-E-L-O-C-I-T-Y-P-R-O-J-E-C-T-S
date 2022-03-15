package logicalProgramming;

public class PrintingPrimeNumbers1_10 {

	public static void main(String[] args) {
		
		int flag = 0;
		int num = 10;
		
		for (int a = 2; a<=num; a++)
		{
			for (int i = 2; i<=a-1; i++)							//here, i can also use "a<i"		
			{
				if (a%i == 0)
					{
						flag = 1;
					}			
			}
		
			
			if (flag == 0)
			{
				System.out.println(a + " is a prime number");
			}
			
			else
			{
				
				System.out.println(a + " is not a prime number");	
				flag = 0;
				
			}
			
		}	

	}

}
