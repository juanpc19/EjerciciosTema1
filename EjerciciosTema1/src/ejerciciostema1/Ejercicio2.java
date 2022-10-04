package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int numeroEntero, resto, numeroSumar1, numeroSumar2; //Declaro las variables
		
		//Creo el Scanner, le doy nombre dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		/*imprimo el mensaje: Introduzca numero entero: en consola mediante uso de System.out.print
		 * escribiendo el mensaje entre comillas " " */
		System.out.print("Introduzca numero entero: " );
		
		//Asigno valor a variable numeroEntero mediante uso del Scanner
		numeroEntero = dogma.nextInt();
		
		/*Asigno valor a variable resto mediante el operador % modulo y el divisor que quiero
		  aplicar a la variable numeroEntero*/
		resto = numeroEntero %7;
		
		//Asigno valor +7 de forma manual a la variable numeroSumar1
		numeroSumar1 = +7;
		
		//Asigno valor 7-resto de forma manual a la variable numeroSumar2
		numeroSumar2 = 7-resto;
		
		/*Asigno valor a la variable resto mediante uso de operador ternario
		  si la expresion condicional: numeroEntero %7 == 0 ? se cumple me devolvera 
		  la variable numeroSumar1 (true) de lo contrario me devolvera numeroSumar2 (false)*/
		resto = numeroEntero %7 == 0 ? numeroSumar1 : numeroSumar2;
		
		/*imprimo el mensaje: Numero que ha de sumarle para obtener multiplo de 7:
		  en consola mediante uso de System.out.print escribiendo el mensaje entre comillas " " */
		System.out.print("Numero que ha de sumarle para obtener multiplo de 7: " + resto);
		
		//Cierro el Scanner con: dogma.close();
		dogma.close();
			
	}

}
