package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// 1. Rellenar un array de tamaño N con valores enteros dados por el usuario a través del 
		//teclado
		
	//Pide un vector por teclado y lo muestra en pantalla
		
		int numeros[];
		int longitud;
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("¿Cuántos elementos quieres?: ");
		longitud= teclado.nextInt();
		
		//inicializar el vector y asignare memoria
		numeros = new int [longitud]; //longitud es el tamaño, he pedido la longitud
		
		System.out.println("Introduce los números: ");
		//ahora llamo a la función,en concreto:
		Vectores.pedir_vector(numeros);
		
		System.out.print("El vector es : ");
		Vectores.mostrar_vector(numeros);
	}

}
