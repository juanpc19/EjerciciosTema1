package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		double primeraD, segundaD, terceraD, distanciaTotal;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Proporcione primera distancia en milimetros: ");
		
		primeraD = dogma.nextDouble();
		
		primeraD = primeraD/10;
		
		System.out.print("Proporcione segunda distancia en centimetros: ");
		
		segundaD = dogma.nextDouble();
		
		System.out.print("Proporcione tercera distancia en metros: ");
		
		terceraD = dogma.nextDouble();
		
		terceraD = terceraD*100;
		
		distanciaTotal = primeraD + segundaD + terceraD; 
		
		System.out.print("La distancia total en centimetros es: " + distanciaTotal);
		
		dogma.close();
		
	}

}
