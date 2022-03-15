package conditionalStatements;

public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.println("To check a particular day in a week:");
		
		int day = 3;											// try using day = 10
		
		switch(day)	//Variable to be tested
			{
			case 1:
				System.out.println("Today's day is Monday");
				break;
				
			case 2:
				System.out.println("Today's day is Tuesday");
				break;
				
			case 3:
				System.out.println("Today's day is Wednesday");
				break;					// If I comment out this break statement, then it will execute the next code/statement
				
			case 4:
				System.out.println("Today's day is Thursday");
				break;		
				
			case 5:
				System.out.println("Today's day is Friday");
				break;		
			
			case 6:
				System.out.println("Today's day is Saturday");
				break;	
				
			case 7:
				System.out.println("Today's day is Sunday");
				break;	
				
				
					default:										
						System.out.println("Not a valid input");
							
			}

	}

}
