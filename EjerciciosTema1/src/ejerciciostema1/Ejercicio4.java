package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		
		double area, base, altura; //Declaro las variables
		
		//Creo el Scanner, le doy nombre dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario la base del triangulo por consola con System.out.print
		System.out.print("Introduzca la base del trianglo: ");
		
		//Asigno valor a base mediante uso del Scanner
		base = dogma.nextDouble();

		//Solicito al usuario la altura del triangulo por consola con System.out.print
		System.out.print("Introduzca la altura del trianglo: ");
		
		//Asigno valor a altura mediante uso del Scanner
		altura = dogma.nextDouble();
		
		//Asigno valor a area mediante operacion aritmetica base*altura/2
		area = (base * altura) /2;
		
		//Proporciono al usuario el area del triangulo a traves de impresion en consola con System.out.print y concateno con el operador +
		System.out.print("El area del triangulo es: " + area + " metros cuadrados");
		
		//Cierro Scanner
		dogma.close();
		
	}

}
