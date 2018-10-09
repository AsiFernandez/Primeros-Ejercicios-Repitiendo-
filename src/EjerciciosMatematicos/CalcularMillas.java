package EjerciciosMatematicos;
import java.util.Scanner;

public class CalcularMillas {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int milla = 1609;
		
		System.out.println("--- Bienvenido al programa para calcular millas en metros ---");
		
		System.out.println("Introduce la cantidad de millas que quieres calcular");
		int cantMillas = Scan.nextInt();
		
		System.out.println(cantMillas + " millas son un total de " + (cantMillas * milla) + " metros");

	}

}
