package keyword2;

public class ThisWithConstructor {

		int a;
		
		ThisWithConstructor(int a)
			{
				this.a = a;
			}
	
		public void myMethod()
			{
				System.out.print("The Value of a = " + a);
				// System.out.println(a);
			}

	
		public static void main(String[] args) 
			{
			ThisWithConstructor rdx = new ThisWithConstructor(22222);
			rdx.myMethod();

			}

}
