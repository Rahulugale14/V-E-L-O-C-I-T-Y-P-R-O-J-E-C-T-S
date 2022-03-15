package logicalProgramming;

public class FrequencyOfAlphabets {

	public static void main(String[] args) {
		
		int counter = 0;
		String str = "I love my country";
		
		char a = 'y';
		
		for (int i = 0; i <= str.length() - 1; i++)
		{
			if (a == str.charAt(i))
			{
				counter++;				
			}	
		}
		
		System.out.println("Frequency of "+a+"  = "+counter);
	}

}
