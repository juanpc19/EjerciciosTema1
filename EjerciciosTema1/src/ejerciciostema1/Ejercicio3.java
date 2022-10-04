package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numero1, numero2, numeroSumar1, numeroSumar2, sumarNumero1, resto; //Declaro las variables
		
		//Creo el Scanner, le doy nombre dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		/*imprimo mensaje: introduzca el primer numero mediante consola con el uso de
		System.out.print*/
		System.out.print("Introduzca el primer numero: ");
		
		//Asigno valor a variable numero1 mediante uso del Scanner
		numero1 = dogma.nextInt();
		
		/*imprimo mensaje: introduzca el segundo numero mediante consola con el uso de
		System.out.print*/
		System.out.print("Introduzca el segundo numero: ");
		
		//Asigno valor a variable numero2 mediante uso del Scanner
		numero2 = dogma.nextInt();
		
		/*Asigno a variable resto su valor con el uso del operador % modulo, el cual nos
		devuelve el resto de un division entre dos numeros indicados*/
		resto = numero1 %numero2;
		
		//Asigno valor 0 a variable numeroSumar1
		numeroSumar1 = 0;
		
		//Asigno valor resta entre numero 2 y resto a variable numeroSumar2
		numeroSumar2 = numero2 - resto;
		
		/*Asigno valor a la variable sumarNumero1 mediante uso de operador ternario
		  si la expresion condicional: numero1 %numero2 == 0 ? se cumple me devolvera 
		  la variable numeroSumar1 (true) de lo contrario me devolvera numeroSumar2 (false)*/
		sumarNumero1 = numero1 %numero2 == 0 ? numeroSumar1 : numeroSumar2;
		
		/*Imprimir por pantalla con uso de System.out.print el siguiente mensaje: Numero que
		ha de sumarle al primer numero para obtener multiplo de segundo numero: y 
		añado la variable sumaNumero1 con el uso de operador + */
		System.out.print("Numero que ha de sumarle al primer numero "
		+ "para obtener multiplo de segundo numero: " + sumarNumero1);
		
		//Cierro el Scanner con: dogma.close();
		dogma.close();

	}

}
