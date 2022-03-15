package keyword1;

public class Practice {

	int a;
	
	public void myNumber1(int n)
	{
		a = n;			// Here; n = 2002
	}
	
	public void myNumber2()
	{
		System.out.println("The value of Instance Variable a = " + a);
		// or we can use:- System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		Practice rdx = new Practice();
		rdx.myNumber1(2002);
		rdx.myNumber2();
	}

}
