package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		double vector2[];
		double vector1[];
		int tamaño2;
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Introdue el tamaño del vector");
		int tam=teclado.nextInt();
		
		System.out.println("Introduce el vector 1");
		Vectores.pedirVector(vector1);
		
		System.out.println("Su vector es:");
		Vectores.mostrarVector(vector1);
		
		System.out.println("¿Cuántos elementos quieres para el vector2:");
		tamaño2= teclado.nextInt();
		vector2=new int[tamaño2];
		
		System.out.println("introduce el vector 2");
		Vectores.pedirVector(vector2);

	}

}
