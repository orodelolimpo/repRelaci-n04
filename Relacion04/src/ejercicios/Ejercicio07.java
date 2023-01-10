package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// 7. Dados dos arrays de reales de tamaño N, suponiendo que modelan dos vectores de un 
		//espacio N-dimensional, decir si son paralelos o no. Son paralelos si todos sus valores 
		//son proporcionales
		
		double vector1[];
		double vector2[];
		int tamaño1;
		int tamaño2;
		
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("¿Cuántos elementos quieres para el vector1:");
		tamaño1= teclado.nextInt();
		vector1=new double [tamaño1];
		System.out.println("introduce el vector 1");
		Vectores.pedirVector(vector1);
		
		System.out.println("¿Cuántos elementos quieres para el vector2:");
		tamaño2= teclado.nextInt();
		vector2=new double [tamaño2];
		
		System.out.println("introduce el vector 2");
		Vectores.pedirVector(vector2);
		
		//boolean paralelos=Vectores.sonParalelos(vector1, vector2);
		//if (paralelos) {
		
		if (Vectores.sonParalelos(vector1, vector2) ==true) {
			System.out.println("Son Paralelos");
		}else {
			System.out.println("No son Paralelos");
		}
	}

}
