package logicalProgramming;

public class Print100to1WithoutLoop {

	
	public void print (int num)
	{
		if (num>=1)
		{
			System.out.print(num);
			print(num - 1);
		}
	}
	
	public static void main(String[] args) {
		
		Print100to1WithoutLoop rdx = new Print100to1WithoutLoop();
		rdx.print(100);
	
	}

}
