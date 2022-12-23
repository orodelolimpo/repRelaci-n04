package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// 4. Dado un array de enteros de tamaño N, rotar sus valores una posición a la izquierda, es 
		//decir, si tenemos un array como el siguiente: 5 -1 -3 15 4, el resultado deberá ser el 
		//array rotado a la izquierda: -1 -3 15 4 5.
		
		int numeros[];
		int longitud;
		Scanner teclado= new Scanner (System.in);
		System.out.println("¿Cuántos elementos quieres?: ");
		longitud= teclado.nextInt();
		numeros = new int [longitud];
		
		System.out.println("Introduce el vector");
		Vectores.pedir_vector(numeros);	
		
		System.out.println("El resultado es: ");
		
		
		

	}

}
