package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Vectores {
	///////////

	public static void pedir_vector(int vector []) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduce el elemento "+i);
			vector[i] = teclado.nextInt();
		}
	}
	//////////////
	public static void mostrar_vector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		System.out.println();
	}

	////////////
	
	public static void mostrarMenoresQue(int v[], int tope) {
		
		for (int  i=0; i<v.length; i++) {
			if (v[i]< tope) {
				System.out.println(v[i]+ " ");
			}
			System.out.println();
		}
	}
	////////////
	
	public static int devuelveMenor (int v[]) {
		int menor =v[0];
		for (int i = 1; i<v.length; i++) {
			menor = v[i];
			
		}
		
	return menor;
	
	}

	
	////////////
	public static void muestraEntreValores (int v[], int a, int b) {
		
		for (int  i=0; i<v.length; i++) {
			if (v[i]> a && v[i]<b ) {
				System.out.println(v[i]+ " ");
			}
			System.out.println();
		}
	
	}
		
		
		public static void rotaValor (int v[]) {
	
			int aux= v[0];
			for (int i = 0; i < v.length; i++) {
		
				
				v[i]= v[i-1];
			}
				v[v.length-1]= aux;
				
				
				
			}	
	}
	
}
//completar //


