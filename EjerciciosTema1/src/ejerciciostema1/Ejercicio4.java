package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		double area, base, altura;

		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca la base del trianglo: ");
		
		base = dogma.nextDouble();

		System.out.print("Introduzca la altura del trianglo: ");
		
		altura = dogma.nextDouble();
		
		area = (base * altura) /2;
		
		System.out.print("El area del triangulo es: " + area + " metros cuadrados");
		
		dogma.close();
		
	}

}
