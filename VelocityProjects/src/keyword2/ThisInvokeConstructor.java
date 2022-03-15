package keyword2;

public class ThisInvokeConstructor {

	ThisInvokeConstructor()
	{
		this(100);
		System.out.println("I'm in Non Parameterized Constructor");
	}
	
	ThisInvokeConstructor(int a)
	{
		System.out.println("I'm in Parameterized Constructor");
	}
	
	
	public static void main(String[] args) 
	{
		new ThisInvokeConstructor();

	}

}
