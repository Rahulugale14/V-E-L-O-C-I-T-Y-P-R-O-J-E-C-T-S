package constructor;

public class Area {
	
	// Declaration
	// Initialization
	// Usage
	
	int radius;									// Declaration
	int side;
	
	
		Area()									// This is constructor
		
			// initialization
		{
			radius = 10;
			side = 20;
			System.out.println("Variables have been initialized:");
		}

			// Usage
		
			public void areaOfCircle()
		
			{
				double AreaCircle = 3.14*10*10;
				System.out.println(AreaCircle);
			}
		
			public void areaOfSquare()
			{
				int AreaSquare = 20*20;
				System.out.println(AreaSquare);
			}
		
	public static void main(String[] args) {
		
		Area rdx = new Area();
		rdx.areaOfCircle();
		rdx.areaOfSquare();

	}

}
