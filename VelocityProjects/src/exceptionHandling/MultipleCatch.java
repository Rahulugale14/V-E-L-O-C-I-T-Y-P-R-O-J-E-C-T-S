package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultipleCatch {

	public static void main(String[] args) {
		
		try 
		{
			System.out.println("0");
			FileInputStream fis = new FileInputStream("G:/mno.txt");		
		}
		
		catch											//child
		(FileNotFoundException e)
		{
			System.out.println("1");
			e.printStackTrace();
			System.out.println("2");		
		}
		
		catch											//parent
		(Exception e)
		{
			System.out.println("3");
			e.printStackTrace();
			System.out.println("4");
		}
		
		System.out.println("5");

	}

}
