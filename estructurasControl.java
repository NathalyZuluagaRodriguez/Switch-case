

public class estructurasControl {
	public static void main(String args[]) {
		  
		int codigo=1;
		
		int numero1= 10;
		int numero2=25;
				
		/* 1. suma
		 * 2. Resta
		 * 3. division
		 * 4. multiplicacion
		 */
		switch(codigo)
		{
			case 1: int suma=(numero1+numero2);
				System.out.println("Suma: " + suma);
				break;
			case 2: int resta=(numero1-numero2);
				System.out.println("Resta: " + resta);
				break;
			case 3: int division=(numero1/numero2);
			System.out.println("Division: " + division);
				break;
			case 4: int multiplicacion=(numero1*numero2);
			System.out.println("Multiplicacion " + multiplicacion);
			break;
			default: System.out.println("numero no valido");
		}	
		  
		 
	}
}
