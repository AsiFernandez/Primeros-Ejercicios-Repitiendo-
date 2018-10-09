package EjerciciosMatematicos;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("introduce la nota del alumno");
		Double nota = Scan.nextDouble();
		
		if(nota < 5) {
			System.out.println("Estudia mas que has suspendido");
		}else if(nota >= 5 && nota < 6 ) {
			System.out.println("Suficiente");
		}else if( nota >= 6 && nota < 7) {
			System.out.println("Bien");
		}else if( nota >= 7 && nota < 8 ) {
			System.out.println("Muy Bien");
		}else if (nota >= 8 && nota < 9 ) {
			System.out.println("Notable");
		}else {
			System.out.println("Sobresaliente");
		}
		
		
		
	}

}
