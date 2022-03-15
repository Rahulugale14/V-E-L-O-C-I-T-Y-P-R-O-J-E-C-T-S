package keyword2;

public class ThisInvokeMethod {

	public void myMethod1()
	{
		System.out.println("I'm in myMethod1");
	}
	
	public void myMethod2()
	{
		this.myMethod1();
		System.out.println("I'm in myMethod2");
	}
	
	public static void main(String[] args) 
	{
		ThisInvokeMethod rdx = new ThisInvokeMethod();
		rdx.myMethod2();
		
	}

}
