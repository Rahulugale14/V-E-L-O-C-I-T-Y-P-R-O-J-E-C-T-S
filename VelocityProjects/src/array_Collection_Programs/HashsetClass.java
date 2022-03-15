package array_Collection_Programs;

import java.util.HashSet;

public class HashsetClass {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		h.add(500);
		h.add(500);
		h.add("abcd");
		h.add('W');
		h.add(1030);
		h.add(null);
		
		System.out.println(h);
		
	}

}
