package keyword1;

public class Test2 {

	int a;														// No value is stored in this Instance Variable
	
	public void myMethod1(int a)									// Local Variable
	{
		this.a = a;												// Here; "int a" is same as "this.a" 
		
	// "this" keyword refers to current class(Test2) "INSTANCE VARIABLE' in the method
		
		System.out.println("Local Variable a = " + a);
	}
	
	public void myMethod2()
	{
		System.out.println("Instance Variable a = " + a);
		
	}
	public static void main(String[] args) {

			Test2 rdx = new Test2();
			rdx.myMethod1(2002);
			rdx.myMethod2();
	}

}
