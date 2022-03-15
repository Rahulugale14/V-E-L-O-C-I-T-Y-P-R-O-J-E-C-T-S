package stringMethods;

public class StringMethodClass {

	public static void main(String[] args) {
		
		String s1 = "DEVashree Patil ";
		String s2 = "devashree patil ";
		String s3 = "Software Engineer";
		
		char c = s1.charAt(3);							// first way
		System.out.println(c);
		System.out.println(s1.charAt(6)); 
		
		boolean b = s1.endsWith("ale");					// second way
		System.out.println(b);
		System.out.println(s1.endsWith("ale"));
		
		System.out.println(s1.equals(s2));				//here, "DEVashree Patil" is not same as "devashree patil"
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.startsWith("DEV"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf("a"));			// here, first index is considered for the String s1
		System.out.println(s1.lastIndexOf("a"));		// here, we'll get last index for the String s1
		System.out.println(s1.concat(s3));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4, 9));
		System.out.println(s1.replace("DEVashree", "Devashree"));
		
		// methods are of two types. Static method and non-static method. For non static method  
		
	}
}
