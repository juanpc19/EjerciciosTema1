package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		double infantiles, adultas, importeTotal;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Cuantas entradas adultas desea? ");

		adultas = dogma.nextDouble();
		
		System.out.print("Cuantas entradas infantiles desea? ");
		
		infantiles = dogma.nextDouble();
		
		importeTotal = adultas*20 + infantiles*15.50;
		
		System.out.print("El coste total de sus entradas es: "
		+ (importeTotal >= 100 ?  importeTotal*0.95: importeTotal));
		
		dogma.close();
		
	}

}
