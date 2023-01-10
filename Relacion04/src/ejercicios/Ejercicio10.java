package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// 10. Dados dos array de enteros de tamaños N y M respectivamente, concatenarlos en un 
		//nuevo array de tamaño N+M, es decir si los arrays de entrada son por ejemplo: 5 -1 -3 
		//15 4 y 3 4 2, el array concatenado resultado deberá ser: 5 -1 -3 15 4 3 4 2. {ejer_12.pas} 
		//CORREGIR
		
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
		
		int resultado[]=Vectores.concatenar(vector1, vector2);
		System.out.println("El vector concatenado es: ");
		Vectores.mostrarVector(resultado);
		
		
	}

}
