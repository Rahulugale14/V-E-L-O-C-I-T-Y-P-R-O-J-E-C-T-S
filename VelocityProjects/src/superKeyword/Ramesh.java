package superKeyword;

public class Ramesh extends Suresh {

	int age = 30;
	
	public void showAge(int age)
	{
		System.out.println(age);
		System.out.println(super.age);
	}
	
	public static void main (String [] args)
	{
		Ramesh r = new Ramesh();
		r.showAge(7);
	}
}
