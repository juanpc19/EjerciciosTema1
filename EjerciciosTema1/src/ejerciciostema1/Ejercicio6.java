package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int horas, minutos, segundos, restoHoras, restoMinutos, segundosFinales;

		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca tiempo en segundos: ");
		
		segundos=dogma.nextInt();
		
		horas = segundos/3600;
		
		restoHoras = segundos %3600;
		
		minutos = restoHoras /60;
		
		restoMinutos = restoHoras %60;
		
		segundosFinales = restoMinutos;
				
		System.out.print("Esa cantidad de tiempo equivale a: " + horas + " horas "
		+ minutos + " minutos y " + segundosFinales + " segundos");
		
	}

}
