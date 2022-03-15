package conversionPrimitive;

public class Primitive_ExplicitCasting {

	public static void main(String[] args) {
		
		long l = 1000000000;
		int i = (int) l;		//here, we did type casting, where we've to write the data type inside method signature 
		System.out.println(i);
		
		float f = 69.55f;
		short s = (short) f;
		System.out.println(s);
		
		short e = 130;
		byte b = (byte) e;
		System.out.println(b);
	}

}
