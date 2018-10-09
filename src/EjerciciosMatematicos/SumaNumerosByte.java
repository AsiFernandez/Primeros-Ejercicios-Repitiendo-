package EjerciciosMatematicos;
import java.util.Scanner;

public class SumaNumerosByte {

	public static void main(String[] args) {
	
		Scanner Scan = new Scanner(System.in);
		System.out.println("Introduce un numero de dos cifras");
		byte numero1 = Scan.nextByte();
		
		System.out.println("Introduce el segundo numero de dos cifras");
		byte numero2  = Scan.nextByte();
		
		System.out.println("la suma de los dos numeros es de " + (numero1 + numero2));
	}
	
}
