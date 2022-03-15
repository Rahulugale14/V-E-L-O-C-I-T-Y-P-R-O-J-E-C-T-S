package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {
	
	public static void main (String [] args) {
	
		try
		{
			FileInputStream fis = new FileInputStream("G:/mno.txt");
		}
		
		catch
		(FileNotFoundException e)
		{
			e.printStackTrace();
		}
			
	}

}
