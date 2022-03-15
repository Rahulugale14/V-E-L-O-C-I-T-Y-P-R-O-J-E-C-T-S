package logicalProgramming;

public class Print1to10WithoutLoop {

	public void print (int num)
	{
		if (num<=10)
		{
			System.out.println(num);
			print(num + 1);
		}
	}
	
	public static void main(String[] args) {
		
		Print1to10WithoutLoop rdx = new Print1to10WithoutLoop();
		rdx.print(1);

	}

}
