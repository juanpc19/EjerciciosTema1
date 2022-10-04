package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		double longitudMetros, longitudCentimetros;
		
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca longitud de lanzamiento en metros "
		+ "con tantos decimales como desee: ");
		
		longitudMetros = dogma.nextDouble();
		
		longitudCentimetros = longitudMetros*100;
	
		System.out.print("La longitud del lanzamiento en centimetros es: " + (int) longitudCentimetros );
		
		dogma.close();

	}

}
