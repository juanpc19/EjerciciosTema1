package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int numero1, numero2; //Declaro varibles int
		boolean resultado; //Declaro variable boolean
		
		//Creo Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario que introduzca primer numero mediante consola usando System.out.print
		System.out.print("Introduzca el primer numero: ");
		
		//Asigno a variable numero1 su valor mediante uso del Scanner
		numero1 = dogma.nextInt();
		
		//Solicito a usuario que introduzca segundo numero mediante consola usando System.out.print
		System.out.print("Introduzca el segundo numero: ");
		
		//Asigno a variable numero2 su valor mediante uso del Scanner
		numero2 = dogma.nextInt();
		
		/*Asigno a variable resultado su valor mediante operador opera y asigna == ,
		lo cual me devolvera true si ambas variables son iguales y false en caso contrario */
		resultado = numero1==numero2;
		
		//Muestro al usuario por consola las respuesta a la pregunta con System.out.print y concatenacion con uso del operador +
		System.out.print("Son ambos numeros iguales?: " + resultado);
		
		//Cierro el Scanner
		dogma.close();
		
		

	}

}
