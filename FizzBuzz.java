package ciclosproject;



public class FizzBuzz 
{
	

	public static void main (String[]args)
	
	{
	for (int i = 1; i <=100; i++) {
		if ( i %3 == 0 && i %5 == 0) {
			
			System.out.println("Es múltiplo de 3 y 5");
		}
		
		else if (i %3 == 0) {
			System.out.println("Es múltiplo de 3");
		}
		
		else if (i %5 == 0) {
			System.out.println("Es múltiplo de 5");
		}
		
		else {
			System.out.println(i);
		}

		
		
	}// for para verificar si un multiplo es de 3 o de 5 
	
	}
}
