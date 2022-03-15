package array_Collection_Programs;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(200);
		a.add("rru");
		a.add('r');
		a.add(1405.2003);
		a.add(200);
		a.add(null);
		a.add(null);
		
		System.out.println(a);
		
		// get size
		System.out.println(a.size());				// SIZE starts from 1
		
		// printing value at a given index
		System.out.println(a.get(4));				// INDEX starts from 0
		
		// remove the value from a particular index
		a.remove(6);
		System.out.println(a);
		
		// to check a value
		System.out.println(a.contains('r'));
		System.out.println(a.contains('R'));
		
		// set a value
		a.set(1, "dru");
		System.out.println(a);
		
		// clear - to delete all records
		a.clear();
		System.out.println(a);
	}

}
