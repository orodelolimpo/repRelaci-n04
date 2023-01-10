package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// 9. Dado un array de enteros de tamaño N, copiarlo a otro array de igual tamaño pero de 
		//forma inversa, es decir, si por ejemplo el array de entrada es: 5 -1 -3 15 4, el resultado 
		//debe ser un nuevo array cuyos valores son: 4 15 -3 -1 5.

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
		
		int inverso[]= Vectores.calcularInverso(vector1);
		System.out.println("La inversa es: ");
		
		Vectores.mostrarVector(inverso);

		

	}
}