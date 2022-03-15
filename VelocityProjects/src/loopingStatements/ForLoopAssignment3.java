package loopingStatements;

public class ForLoopAssignment3 {

	public static void main(String[] args) {
		
		int r = 10;
		
		System.out.print("The even numbers from 1 to "+r+" are: ");
		
		for (int a = 1; a <= r; a++)
		{
			
			if (a%2 == 0)
			{
				System.out.print(a + " ");	
			}
			
		
		}

		System.out.println("");
		System.out.print("The odd numbers from 1 to "+r+" are: ");
		
		for (int a = 1; a <= r; a++)
		{
			
			if (a%2 != 0)
			{
				System.out.print(a + " ");
			}
		}

	}

}
