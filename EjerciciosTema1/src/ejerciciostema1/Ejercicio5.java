package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		double y,x,a,b,c;

		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca valor de a: ");
		
		a = dogma.nextDouble();
		
		System.out.print("Introduzca valor de b: ");
		
		b = dogma.nextDouble();
		
		System.out.print("Introduzca valor de c: ");
		
		c = dogma.nextDouble();
		
		System.out.print("Introduzca valor de x: ");
		
		x = dogma.nextDouble();
		
		y = (a*(x*x)) + (b*x) + c;
		
		System.out.print("El valor de y es igual a: " + y);
		
		dogma.close();
		
	}

}
