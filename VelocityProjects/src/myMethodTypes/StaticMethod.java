package myMethodTypes;

public class StaticMethod {

	
	public static void myMethod1()
	
	{	
		System.out.println("I am in Static Method1");
	}

	public static void myMethod2()
	
	{	
		System.out.println("I am in Static Method2");
	}
	
	public static void main(String[] args) {

			myMethod1();
		 StaticMethod.myMethod2();
		 
	}
}
