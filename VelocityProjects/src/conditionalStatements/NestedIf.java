package conditionalStatements;

public class NestedIf {

	public static void main(String[] args) {
	
		System.out.println("Welcome to blood donation camp");
		int age = 18;
		int weight = 85;
		
		if (age >= 18)
			{
				System.out.println("Condition 1 is satisfied");
			
				
				if (weight < 45)					
				{
					System.out.println("Condition 2 is satisfied");
					System.out.println("You're are eligible to donate blood");
				}
			}
		
		else 
		{
			System.out.println("You're not eligilble for blood donation");
		}

	}

}
