package conversionNonPrimitive_Upcasting;

public class Ex2_UpCasting {
		// no method overriding

	public static void main(String[] args) {
	
		Ex2_Father f = new Ex2_Son();
		f.farm();
		f.home();
		
		System.out.println(f.age);
	}

}
