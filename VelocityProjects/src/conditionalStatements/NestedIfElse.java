package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		
	System.out.println("To check whether the number is Even, Odd or Negative: \n");
		
	int a = 1000;													// Try using a = 77 & a = -777				
		
		if (a > 0) 
			{
				System.out.println("Number is Positive");
				
					if (a%2 == 0)
					
						{
							System.out.println("Yes, the number is an Even number");
						}
					
					else 
					{
						System.out.println("Number is Odd");
					}
			}
		
		
		else
			{
				System.out.println("It's a negative number");
			}
		
		
	}

}
