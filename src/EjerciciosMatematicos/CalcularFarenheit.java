package EjerciciosMatematicos;
import java.util.Scanner;

public class CalcularFarenheit {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("--- Bienvenido al programa para calcular la conversion de grados Celsius a Farenheit ---");
		System.out.println("Introduce la cantidad de grados Celsius");
		double gradosCelsius = Scan.nextDouble();
		
		double gradosFarenheit  = (((9 * gradosCelsius)/5)+32);
		System.out.println(gradosCelsius + " grados Celsius son el equivalente a " + gradosFarenheit + " grados Farenheit");
	}

}
