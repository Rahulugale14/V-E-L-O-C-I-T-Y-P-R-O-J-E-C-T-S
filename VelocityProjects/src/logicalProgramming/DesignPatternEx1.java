package logicalProgramming;

public class DesignPatternEx1 {

	public static void main(String[] args) {
		

		for (int i = 1; i <=5; i++)
		{
			for (int j = 1; j<=i; j++)
			{
				System.out.print("*");				//here, try using "1"
			}
			System.out.println();
		}
	}

}
