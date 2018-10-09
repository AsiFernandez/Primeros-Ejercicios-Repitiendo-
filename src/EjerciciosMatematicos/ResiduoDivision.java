package EjerciciosMatematicos;
import java.util.Scanner;

public class ResiduoDivision {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("--- Bienvenido al programa para calcular el residuo de la division ---");
		
		System.out.println("Por favor introduce el dividendo");
		int Dividendo = Scan.nextInt();
		
		System.out.println("Por favor introduce el divisor");
		int Divisor = Scan.nextInt();
		
		System.out.println("El residuo de la division es de = " + (Dividendo % Divisor));
		
	}

}
