package variables;

public class InstanceVariable13thOctober {

			int a = 100;
			int b = 10;
	
	public void substraction()		
		{
			int d = a - b;
			System.out.println(d);
		}
			
	public void division()
		{
			int c = a/b;
			System.out.println(c);
		}
			
	public static void main(String[] args) {
			// Here we can only call non-static method
			// ClassName ObjRefVar = new Constructor(); 
			// ObjRefVar.MethodName();
					InstanceVariable13thOctober rdx = new InstanceVariable13thOctober();
					rdx.substraction();
					rdx.division();
	}
}
