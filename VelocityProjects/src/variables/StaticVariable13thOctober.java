package variables;

public class StaticVariable13thOctober {
	
			static int a = 100;
			static int b = 10;
			
	public void addition()
		{
			int c = a + b;
			System.out.println(c);
		}
	
	public static void substraction()
	{
		int d = a - b;
		System.out.println(d);
	}

	public static void division()
		{
			int e = a/b;
			System.out.println(e);
		}
	
	public static void main(String[] args) {
		StaticVariable13thOctober rdx = new StaticVariable13thOctober();  	// NonStatic Method
		rdx.addition();
		
		division(); 						// Static Method
		substraction();						// Static Method
	}
}
