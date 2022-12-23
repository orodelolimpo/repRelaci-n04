package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// 2. Dado un array de enteros de tamaño N, visualizar por pantalla todos los elementos del 
		//mismo cuyo valor sea menor que un número A. 
		
		int numeros[];
		int longitud;
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("¿Cuántos elementos quieres?: ");
		longitud= teclado.nextInt();
		
		numeros = new int [longitud];
		System.out.println("Introduce el vector");
		Vectores.pedir_vector(numeros);
		
		System.out.println("Introduce el número límite: ");
		int tope= teclado.nextInt();
		
		System.out.println("Los números son: ");
		Vectores.mostrar_vector(numeros);
		
		System.out.printf("Los número menores que %d son:\n ", tope);
		Vectores.mostrarMenoresQue(numeros, tope);
		
	}

}
