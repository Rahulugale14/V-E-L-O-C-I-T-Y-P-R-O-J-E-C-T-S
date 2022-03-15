package variables;

public class LocalVariables12thOctober {

	public void myMethod()
		{
			int r = 14;		// local variable
			int d = 20;
			System.out.println(r);
			System.out.println(d);
		}
	
	public static void myMethod1()
		{
			int r1 = 1405;		// local variable
			int d1 = 2003;
			System.out.println(r1);
			System.out.println(d1);
		}
	
	public static void main(String[] args) {
		
		// ClassName ObjRefVariable = new Constructor();
			LocalVariables12thOctober abc = new LocalVariables12thOctober();
			abc.myMethod();
			
		// MethodName();     			 OR      		ClassName.MethodName();
			myMethod1();
	}
}
