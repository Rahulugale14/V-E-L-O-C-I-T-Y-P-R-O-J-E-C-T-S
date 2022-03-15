package conversionNonPrimitive_Upcasting;

public class Ex1_UpCasting {

	// here, using method overriding
	
	public static void main(String[] args) {
		
		Ex1_Animal a = new Ex1_Shark(); 		// Parent p = new Child(); // Upcasting
		a.nature();
		
		System.out.println(a.name);
	}

}
