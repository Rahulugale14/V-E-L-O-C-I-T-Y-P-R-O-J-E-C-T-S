package array_Collection_Programs;

public class ArrayFirst {

	public static void main(String[] args) {
		
		int a[] = new int[3];						// index 0, 1, 2
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		// a[3] = 20;								// if declared, then we get run time error
		
		
		System.out.println(a[0]);					// first way 
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		for(int i =0; i<a.length; i++)				// second way
		{
			System.out.println(a[i]);
		}
	}

}
