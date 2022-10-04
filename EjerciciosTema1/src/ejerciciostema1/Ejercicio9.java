package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int numero1, numero2;
		boolean resultado;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca el primer numero: ");
		
		numero1 = dogma.nextInt();
		
		System.out.print("Introduzca el segundo numero: ");
		
		numero2 = dogma.nextInt();
		
		resultado = numero1==numero2;
		
		System.out.print("Son ambos numeros iguales?: " + resultado);
		
		dogma.close();
		
		
		
		
		
		
		
		
		
		

	}

}
