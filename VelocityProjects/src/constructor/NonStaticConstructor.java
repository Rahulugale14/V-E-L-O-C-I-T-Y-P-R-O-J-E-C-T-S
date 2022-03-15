package constructor;

public class NonStaticConstructor {

		int a = 200;
	
			public void info()
			
					{
						
						System.out.println(a);
					}
	
	
			public static void main(String[] args) {
		
				NonStaticConstructor rdj = new NonStaticConstructor();
				rdj.info();
		
				// OR another way to call constructor
				// System.out.println(Obj.MethodName);
				System.out.println(rdj.a);				
		
	}

}
