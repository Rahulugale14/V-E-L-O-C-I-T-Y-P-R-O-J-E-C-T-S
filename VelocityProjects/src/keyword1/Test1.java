package keyword1;

public class Test1 {

	// int r = 14;											// Instance Variable
	
	public void myMethod(int d)							// Local Variable
	{
		System.out.print("The value of d is: ");
		System.out.println(d);
	}
	
	
	public static void main(String[] args) 
	
	{
		Test1 rdx = new Test1();
		rdx.myMethod(1420);
	}

}
