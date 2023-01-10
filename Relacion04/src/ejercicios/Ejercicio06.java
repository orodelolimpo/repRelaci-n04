package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		//6. Dado un array de enteros de tamaño N, se debe buscar el primer elemento del array 
		//mayor que un número A, y a partir de él inclusive, visualizar todos los valores de los 
		//siguientes hasta el último elemento del array.
		int vector[];
		int tamaño;
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("¿Cuántos elementos quieres para el vector:");
		tamaño= teclado.nextInt();
		vector=new int [tamaño];
		
		//llamo a la función
		
		Vectores.pedirVector(vector);
		System.out.println("Introduce el número a partir del cual quieres monstrar los valores");
		int mayor =teclado.nextInt();
		
		
		System.out.printf("Los valores a partir del número mayor que %d son\n ", mayor);
		
		Vectores.mostrarDesdeMayorA(vector, mayor);
		
		
	}

}
