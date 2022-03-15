package conversionNonPrimitive_Downcasting;

public class Ex1_Downcasting {

	public static void main(String[] args) {

		Ex1_Father f = new Ex1_Son();				// Upcasting
		
		Ex1_Son s = (Ex1_Son)f;						// Downcasting
		
		s.bike();
		s.job();
		s.farm();
		s.home();
		
	}

}
