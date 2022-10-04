package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		double numeroIntroducido, redondeo = 0.5; /*Declaro la variable numeroIntroducido 
		y redondeo y asigno valor de 0.5 a redondeo*/
		
		int numeroRedondeado; //Declaro la variable numeroRedondeado
		
		//Creo el Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		/*Le pido al usuario que introduzca un numero con decimales usando System.out.print
		e introduciendo el mensaje entre comillas " " */
		System.out.print("Introduzca un numero con decimales: ");
		
		//Le asigno un valor a la variable numeroIntroducido mediante el uso del Scanner
		numeroIntroducido = dogma.nextDouble();
		
		/*Le doy valor a la variable numeroRedondeado mediante la suma de la variable
		  numeroIntroducido y la constante REDONDEO, ademas aplico un casting a dicha operacion
		  para que el resultado me sea devuelto en variable tipo int*/
		numeroRedondeado = (int) (numeroIntroducido + redondeo);
		
		/*Imprimo por consola el mensaje: El numero redondeado al entero más próximo es:
		 * usando System.out.print e introduciendo el mensaje entre comillas " " 
		y añadiendo variable numeroRedondeado mediante concatenacion con el operador + */
		System.out.print("Este es el numero redondeado al entero más próximo es: " + numeroRedondeado);
		
		//cierro el Scanner con: dogma.close();
		dogma.close();
			
	}

}
