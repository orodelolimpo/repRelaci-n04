package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// 4. Dado un array de enteros de tamaño N, rotar sus valores una posición a la izquierda, es 
		//decir, si tenemos un array como el siguiente: 5 -1 -3 15 4, el resultado deberá ser el 
		//array rotado a la izquierda: -1 -3 15 4 5.
		
		int vector[];
		int tamaño;
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduce el número de elementos del vector");
		tamaño= teclado.nextInt();
		vector=new int [tamaño];
		

		System.out.println("Introduce el vector");
		Vectores.pedirVector (vector); //me falta este en vectores
		
		System.out.println("El vector es: ");
		Vectores.mostrarVector(vector);
		Vectores.rotarIzquierda (vector);
		
		System.out.println("El vector rotados es");
		Vectores.mostrarVector(vector);
		
		
		
		

	}

}
