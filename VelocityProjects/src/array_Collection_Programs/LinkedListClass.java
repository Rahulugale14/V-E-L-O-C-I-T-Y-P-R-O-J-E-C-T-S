package array_Collection_Programs;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add(500);
		l.add("abcd");
		l.add('W');
		l.add(1030);
		l.add(null);
		l.add(null);
		
		System.out.println(l);
		
		// get the size
		System.out.println(l.size());
		
		// printing value at a particular index
		System.out.println(l.get(2));
		
		// set a value at a particular index
		l.set(1, "XYZ");
		System.out.println(l);
		
		// remove a value at a particular index
		l.remove(4);
		System.out.println(l);
		
		// to check a value
		System.out.println(l.contains("XYZ"));
		
		// to check if it is empty
		System.out.println(l.isEmpty());
		
		// to delete all records
		l.clear();
		System.out.println(l);

	}

}
