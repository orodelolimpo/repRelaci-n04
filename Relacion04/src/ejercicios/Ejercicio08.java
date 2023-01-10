package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// 8. Dado un array de enteros de tamaño N, decir si es capicúa o no, es decir, si por 
		//ejemplo el array es: 5 2 1 2 5, el resultado debe ser “verdad”(se debe tener en cuenta 
				//que el tamaño el array puede ser par o impar).
		
		int vector[];
		int tamaño;
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("¿Cuántos elementos quieres para el vector:");
		tamaño= teclado.nextInt();
		
		vector=new int [tamaño];
		
		System.out.println("Introduce tu vector");
		Vectores.pedirVector(vector);
		
		System.out.println("Tu vector es:");
		Vectores.mostrarVector(vector);
		
		if (Vectores.esCapicua(vector)) {
			System.out.println("ES capicua");
		}else {
			System.out.println("NO capicua");
		}
		
		
	}

}
