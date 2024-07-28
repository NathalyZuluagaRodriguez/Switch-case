import java.util.Scanner;

public class estructurasControlSeg {
    public static void main(String args[]) {
	Scanner entrada = new Scanner(System.in);

    
    System.out.print("Ingresa un número del 1 al 5: ");
    int numero = entrada.nextInt();

   
    switch (numero) {
        case 1:
            System.out.println("Has ingresado el número 1.");
            break;
        case 2:
            System.out.println("Has ingresado el número 2.");
            break;
        case 3:
            System.out.println("Has ingresado el número 3.");
            break;
        case 4:
            System.out.println("Has ingresado el número 4.");
            break;
        case 5:
            System.out.println("Has ingresado el número 5.");
            break;
        default:
            System.out.println("Número fuera del rango. Por favor, ingresa un número del 1 al 5.");
            break;
    }

    
    entrada.close();
}
}