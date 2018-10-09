package EjerciciosMatematicos;
import java.util.Scanner;

public class CalcularBilletes {

	public static void main(String[] args) {
		
		
		Scanner Scan = new Scanner(System.in);
		
		int Cantidad = 0;
		int B10 = 0;
		int B5 = 0;
		int M1 = 0;
		
		
		System.out.println("introduce una cantidad de €");
		Cantidad = Scan.nextInt();
		
		
		while (Cantidad >= 10) { 
            B10++;
            Cantidad = Cantidad - 10; 
        } 
 
        while (Cantidad >= 5) { 
            B5++; 
            Cantidad = Cantidad - 5; 
        } 

        while (Cantidad >= 1) { 
            M1++; 
            Cantidad = Cantidad - 1; 
        }
		
		
		System.out.println(B10 +" Billetes de 10  " + "\n" + B5 + " Billete de 5 " + "\n"  + M1  + " Monedas de 1 " );

		
//		Scanner Scan = new Scanner(System.in);
//		
//		int Cantidad = 0;
//		int B10 = 0;
//		int B5 = 0;
//		int M1 = 0;
//		
//		System.out.println("introduce una cantidad de €");
//		Cantidad = Scan.nextInt();
//		
//		
//		B10  = Cantidad / 10; 
//		Cantidad = Cantidad % 10;
//		
//		B5 = Cantidad / 5;
//		Cantidad = Cantidad % 5;
//		
//		M1 = Cantidad % 1;
//		
//		System.out.println(B10 +" Billetes de 10  " + "\n" + B5 + " Billete de 5 " + "\n"  + M1  + " Monedas de 1 " );
//		
		
		
		
		
		
		
		
	}

}
