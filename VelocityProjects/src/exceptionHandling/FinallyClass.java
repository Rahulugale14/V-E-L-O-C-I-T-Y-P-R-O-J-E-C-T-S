package exceptionHandling;

public class FinallyClass {

	public static void main(String[] args) {
		
		try 
		{
			int a, b, c;
			
			a = 10;
			b = 0;
			c = a/b;
		}
		
		finally
		{
			System.out.println("I'm in Finally block");
		}
	
	}

}
