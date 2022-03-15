package exceptionHandling;

public class MethodsToPrintException {

	public static void main(String[] args) {
		
		try 
		{
			String str = "John";					//0 to 3
			System.out.println(str.charAt(7));
			System.out.println("Hello World");
		}
		
		catch 
			(Exception e)											
		{
			e.printStackTrace();												// will show - exception, description, stacktrace
			
			System.out.println(" ---------------------- ");
			
			System.out.println(e);											// will show - exception and description
			
			System.out.println(" ---------------------- ");
			
			System.out.println(e.getMessage());					// will show - description
			
		}
		
	}

}
