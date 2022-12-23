package ejercicios;

import java.util.Scanner;

public class EjercicioMenor {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		int numeros[];
		int longitud;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el número de elementos:");
		longitud =teclado.nextInt();
		
		numeros = new int [longitud];
		
		System.out.println("Introduce tus números");
		Vectores.mostrar_vector(numeros);
		
		System.out.println("El menor elemento del vector es " 
				+ Vectores.devuelveMenor(numeros));
		
		//int menor = Vectores.devuelveMenor (numeros);System.out.println ("El menor es " + menor);
		

	}

}
