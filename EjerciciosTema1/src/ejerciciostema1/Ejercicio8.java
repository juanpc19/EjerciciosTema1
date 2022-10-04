package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		double infantiles, adultas, importeTotal; //Declaro variables
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario cantidad de entradas adultas a comprar mediante mensaje por consola con uso de System.out.print
		System.out.print("Cuantas entradas adultas desea? ");

		//Asigno valor a variable adultas con uso de Scanner
		adultas = dogma.nextDouble();
		
		//Solicito al usuario cantidad de entradas infantiles a comprar mediante mensaje por consola con uso de System.out.print
		System.out.print("Cuantas entradas infantiles desea? ");
		
		//Asigno valor a variable infantiles con uso de Scanner 
		infantiles = dogma.nextDouble();
		
		/*Asigno valor a variable importeTotal multiplicando cada variable por su precio en taquilla y 
		sumando el resultado de dichas multiplicaciones */
		importeTotal = adultas*20 + infantiles*15.50;
		
		/* Uso operador ternario e indico que si el importe total es mayor a 100 se aplique descuento del 5%,
		 * de lo contrario el valor del importe permanece igual
		 * Muestro por consola el coste total de las entradas con uso de System.out.print y concatenacion con operardor +*/

		System.out.print("El coste total de las entradas es: "
		+ (importeTotal >= 100 ?  importeTotal*0.95: importeTotal));
		
		//Cierro Scanner
		dogma.close();
		
	}

}
