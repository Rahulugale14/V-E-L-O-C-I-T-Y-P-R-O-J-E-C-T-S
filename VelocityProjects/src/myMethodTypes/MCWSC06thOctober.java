package myMethodTypes;

public class MCWSC06thOctober {
// Method calling within same class
	
		public void lipstick ()
	{
			System.out.println("Lakme is a lipstick company");
	}
	
		public static void clothes ()
	{
			System.out.println("Zara is a clothing brand \n");
	}
		
		public static void main(String[] args) {
											
			MCWSC06thOctober.clothes();						// (For Static Method)
			clothes();
		
		// ClassName ObjRefVar = new Constructor(); ------ (For Non Static Method)
			MCWSC06thOctober obj = new MCWSC06thOctober();
			obj.lipstick();
		
	}
}
