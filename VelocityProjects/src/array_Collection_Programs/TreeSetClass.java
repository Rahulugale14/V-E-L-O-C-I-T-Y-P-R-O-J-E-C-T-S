package array_Collection_Programs;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		
		// it is homogeneous
		
		TreeSet t = new TreeSet();
		t.add("f");
		t.add("a");
		t.add("F");
		t.add("A");
		t.add("D");
		t.add("G");
		t.add("R");
		// t.add(1420);			// see for exception
		t.add("Z");
		t.add("Y");
		
		System.out.println(t);
		
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
	}

}
