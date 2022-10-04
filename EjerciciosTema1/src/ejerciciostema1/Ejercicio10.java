package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		double longitudMetros, longitudCentimetros; //Declaro variables
		
		//Creo Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario la longitud del lanzamiento en metros mediante mensaje por consola con uso de System.out.print
		System.out.print("Introduzca longitud de lanzamiento en metros "
		+ "con tantos decimales como desee: ");
		
		//Asigno valor a variable longitudMetros con uso del Scanner
		longitudMetros = dogma.nextDouble();
		
		//Asigno valor a variable longitudCentimetros multiplicando variable longitudMetros por 100
		longitudCentimetros = longitudMetros*100;

		/*Muestro a usuario la longitud del lanzamiento en centimetros usando System.out.print 
		y operador + para concatenar la variable al resto del mensaje , aplicando un cast de tipo int a la variable 
		para mostrar el resultado en la forma requerida*/
		System.out.print("La longitud del lanzamiento en centimetros es: " + (int) longitudCentimetros );
		
		//Cierro Scanner
		dogma.close();

	}

}
