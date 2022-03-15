package logicalProgramming;

public class ReverseWithZero {

	public static void main(String[] args) {
		
		int r = 1420;
		int a;
		
		while (r>0)
		{
			a = r%10;
			r = r/10;
			System.out.print(a);
		}
	}

}
