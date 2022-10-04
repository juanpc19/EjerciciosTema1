package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int horas, minutos, segundos, restoHoras, restoMinutos, segundosFinales; //Declaro variables

		//Creo Scanner, le doy nombre y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito al usuario el valor de la variable tiempo en segundos con System.out.print
		System.out.print("Introduzca tiempo en segundos: ");
		
		//Asigno valor a variable segundos mediante uso del Scanner
		segundos=dogma.nextInt();
		
		//Asigno a variable horas su valor dividiendo variable segundos entre 3600
		horas = segundos/3600;
		
		/* Obtengo los segundos sobrantes y los asigno a variable restoHoras haciendo uso del operador modulo %
		para obtener el resto de la division */
		restoHoras = segundos %3600;
		
		//Asigno valor a variable minutos dividiendo la variable restoHoras entre 60
		minutos = restoHoras /60;
		
		/* Obtengo los segundos sobrantes y los asigno a variable restoMinutos haciendo uso del operador modulo %
		para obtener el resto de la division */
		restoMinutos = restoHoras %60;
		
		//Asigno los segundos sobrantes a variable segundosFinales con variable restoMinutos
		segundosFinales = restoMinutos;
				
		/*Muestro al usuario el tiempo introducido en horas, minutos y segundos usando las variables horas, minutos, segundos,
		usando concatenaciones con el texto con operador + */
		System.out.print("Esa cantidad de tiempo equivale a: " + horas + " horas "
		+ minutos + " minutos y " + segundosFinales + " segundos");
		
		//Cierro Scanner
		dogma.close();
		
	}

}
