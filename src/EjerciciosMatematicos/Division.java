package EjerciciosMatematicos;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
		
		//Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario.
		
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("--- Bienvenido al programa para hacer divisiones ---");
		
		System.out.println("Introduce el dividendo por favor");
		int dividendo = Scan.nextInt();
		
		System.out.println("Introduce el divisor por favor");
		int divisor = Scan.nextInt();
		
		if(dividendo > divisor) {
		System.out.println("La division de tus numeros es = " + (dividendo / divisor));
	}else {
		System.out.println("no se pueden hacer divisiones asi.");
	}
		
	}

}
