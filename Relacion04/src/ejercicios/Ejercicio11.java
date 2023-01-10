package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// 11. Dados dos vectores, calcular la suma de ambos
		
		int vector1[];
		int tamaño1;
		int vector2[];
		int tamaño2;
		
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("¿Cuántos elementos quieres para el vector:");
		tamaño1=teclado.nextInt();
		
		vector1=new int [tamaño1]; //inicializo el vector, le doy el valor del tamaño
		
		System.out.println("Introduce su vector:");
		Vectores.pedirVector(vector1);
		
		System.out.println("Su vector es:");
		Vectores.mostrarVector(vector1);
		
		System.out.println("¿Cuántos elementos quieres para el vector2:");
		tamaño2= teclado.nextInt();
		vector2=new int [tamaño2];
		
		System.out.println("introduce el vector 2");
		Vectores.pedirVector(vector2);
		

	}

}
