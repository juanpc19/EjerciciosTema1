package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		double primeraD, segundaD, terceraD, distanciaTotal; //Declaro variables
		
		//Creo un Scnner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario la primera distancia por consola en milimetros con System.out.print
		System.out.print("Proporcione primera distancia en milimetros: ");
		
		//Asigno valor a variable primeraD mediante uso del Scanner
		primeraD = dogma.nextDouble();
		
		//Paso el valor de la variable primeraD a centimetros
		primeraD = primeraD/10;
		
		//Solicito al usuario la segunda distancia por consola en centimetros con System.out.print
		System.out.print("Proporcione segunda distancia en centimetros: ");
		
		//Asigno valor a variable segundaD mediante uso del Scanner
		segundaD = dogma.nextDouble();
		
		//Solicito al usuario la tercera distancia por consola en metros con System.out.print
		System.out.print("Proporcione tercera distancia en metros: ");
		
		//Asigno valor a variable terceraD mediante uso del Scanner
		terceraD = dogma.nextDouble();
		
		//Paso el valor de la variable terceraD de metros a centimetros
		terceraD = terceraD*100;
		
		//Asigno a variable distanciaTotal valor mediante suma de variable primeraD, segundaD Y terceraD
		distanciaTotal = primeraD + segundaD + terceraD; 
		
		/* Muestro al usuario el valor de la variable distanciaTotal por consola en centimetros con System.out.print y
		concatenacion con operador + */
		System.out.print("La distancia total en centimetros es: " + distanciaTotal);
		
		//Cierro el Scanner
		dogma.close();
		
	}

}
