package EjerciciosMatematicos;
import java.util.Scanner;

public class BaseTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan  = new Scanner(System.in);
		
		System.out.println("Bienvenido al calculador de areas de triangulos");
		
		System.out.println("Introduce la base del triangulo");
		int base = Scan.nextInt();
		
		System.out.println("Introduce la altura del triangulo");
		int altura = Scan.nextInt();
		
		int superficie = ((base * altura)/2);
		
		System.out.println("la superficie del triangulo es de " + superficie);
	}

}
