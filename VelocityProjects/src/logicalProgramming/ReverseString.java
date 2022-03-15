package logicalProgramming;

public class ReverseString {

	public static void main(String[] args) {
		
		String rev = "";
		String str = "Brock Lesnar";
		
		System.out.println("Length = " + str.length());
		
		
		for (int b = str.length()-1; b>=0; b--)
		{
			rev = rev + str.charAt(b);
		}
		
		System.out.println(rev);

	}

}
