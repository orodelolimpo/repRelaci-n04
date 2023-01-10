package ejercicios;

import java.util.Scanner;

public class Ejercicio04bis {

	public static void main(String[] args) {
		// igual pero preguntando cuantas rotaciones a la izq quiero hacer
		
		
		int vector[];
		int tamaño;
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduce el número de elementos del vector");
		tamaño= teclado.nextInt();
		vector=new int [tamaño];
		System.out.println("¿Cuántas rotaciones quieres hacer");
		int veces =teclado.nextInt();
		

		System.out.println("Introduce el vector");
		Vectores.pedirVector (vector); //me falta este en vectores
		
		System.out.println("El vector es: ");
		Vectores.mostrarVector(vector);
		
		for (int i=0; i<veces; i++) {
			Vectores.rotarIzquierda (vector);
		}
		//si no quiero hacer este for hago otra función, que aunque se llame igual al pasar dos parámetros me coge la que necesita
	
		System.out.println("El vector rotados es");
		Vectores.mostrarVector(vector);
		

	}

}
