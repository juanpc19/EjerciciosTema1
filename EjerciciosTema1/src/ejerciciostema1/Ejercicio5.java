package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		double y,x,a,b,c; //Declaro variables

		//Creo el Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario el valor de variable a con impresion en consola con System.out.print
		System.out.print("Introduzca valor de a: ");
		
		//Asigno a variable a mediante uso del Scanner
		a = dogma.nextDouble();
		
		//Solicito al usuario el valor de variable b con impresion en consola con System.out.print
		System.out.print("Introduzca valor de b: ");
		
		//Asigno a variable b mediante uso del Scanner
		b = dogma.nextDouble();
		
		//Solicito al usuario el valor de variable c con impresion en consola con System.out.print
		System.out.print("Introduzca valor de c: ");
		
		//Asigno a variable c mediante uso del Scanner
		c = dogma.nextDouble();
		
		//Solicito al usuario el valor de variable x con impresion en consola con System.out.print
		System.out.print("Introduzca valor de x: ");
		
		//Asigno a variable x mediante uso del Scanner
		x = dogma.nextDouble();
		
		//Asigno a variable y mediante la operacion aritmetica: (a*(x*x)) + (b*x) + c
		y = (a*(x*x)) + (b*x) + c;
		
		//Muestro al usuario el valor de variable y con mensaje y concatenacion de y con operador +
		System.out.print("El valor de y es igual a: " + y);
		
		//cierro Scanner
		dogma.close();
		
	}

}
