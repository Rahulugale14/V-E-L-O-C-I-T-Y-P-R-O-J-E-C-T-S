package myMethodTypes;

public class NonStaticMethod {

	public void info1()
	{
	System.out.println("I am in non Static Method");
	System.out.println("This Method is easy to understand");
	System.out.println("Let's make some more programs \n");
	}
	
	public void info2()
	{
	System.out.println("I am creating other non Static Method");
	System.out.println("This Method is very easy to understand");
	System.out.println("Let's make a lot of programs");
	}
		
	public static void main(String[] args) {
		// ClassName ObjRefVariable = new Constructor();
		NonStaticMethod obj = new NonStaticMethod();
		obj.info1();
		obj.info2();
	}
}
