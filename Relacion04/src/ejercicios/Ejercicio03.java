package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// 3. Dado un array de reales del tamaño N, visualizar por pantalla todos los elementos del 
		//mismo cuyo valor pertenezca al intervalo [a,b).
		
		int numeros[];
		int longitud;
		int a, b;
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("¿Cuántos elementos quieres?: ");
		longitud= teclado.nextInt();
		numeros = new int [longitud];
		
		System.out.println("Introduce el vector");
		Vectores.pedir_vector(numeros);	
		
		System.out.println("Introduce el intervalo a: ");
		a = teclado.nextInt();
		
		System.out.println("introducde el intervalo b: ");
		b= teclado.nextInt();
		
		System.out.println("El resultado es: ");
		
		Vectores.muestraEntreValores(numeros, a, b);
		
	}

}
