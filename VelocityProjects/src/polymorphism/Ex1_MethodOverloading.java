2package polymorphism;

public class Ex1_MethodOverloading {

	public void myMethod (int r, int d)
	{
		System.out.println( r*d);
	}
	
	public static void myMethod (int d, int a, String str)
	{
		System.out.println(d*a + " is the multiplication");
	}
	
	public void myMethod (double d, int f, String str)
	{
		System.out.println(d+f + " Hello Everyone");
	}
	
	
	public static void main(String[] args) {
		
		Ex1_MethodOverloading M = new Ex1_MethodOverloading();
		M.myMethod(14.05, 05, "Hey");
		myMethod(14, 05, " hey");
		M.myMethod(14, 20);
	}

}
