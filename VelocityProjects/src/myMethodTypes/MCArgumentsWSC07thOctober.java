package myMethodTypes;

public class MCArgumentsWSC07thOctober {

	
		public void myMethod1(int a)
		{
			System.out.println("I'm am in Method1");
		}
	
		public static void myMethod2(String str)
		{
			System.out.println("I'm am in Method2");
		}
	
		
		public static void main(String[] args) {
			
			// Non Static Method
			// ClassName ObjRefVar = new Constructor();
			MCArgumentsWSC07thOctober rdx = new MCArgumentsWSC07thOctober();
			rdx.myMethod1(2002);
			
			// Static Method
			myMethod2("iphone 12");	
		}		
}
