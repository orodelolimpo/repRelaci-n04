package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Vectores {
/////////////////////////////////////////////////

	public static void pedirVector(int vector []) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduce el elemento "+i);
			vector[i] = teclado.nextInt();
		}
	}
/////////////////////////////////////////////////
	public static void pedirVector(double vector []) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduce el elemento "+i);
			vector[i] = teclado.nextInt();
		}
	}
	
	
	
/////////////////////////////////////////////
	public static void mostrarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		System.out.println();
	}

//////////////////////////////////////////
	
	public static void mostrarMenoresQue(int v[], int tope) {
		
		for (int  i=0; i<v.length; i++) {
			if (v[i]< tope) {
				System.out.println(v[i]+ " ");
			}
			System.out.println();
		}
	}
/////////////////////////////////////////
	
	public static int devuelveMenor (int v[]) {
		int menor =v[0];
		for (int i = 1; i<v.length; i++) {
			menor = v[i];
			
		}
		
	return menor;
	
	}

	
////////////////////////////////////////
	public static void muestraEntreValores (int v[], int a, int b) {
		
		for (int  i=0; i<v.length; i++) {
			if (v[i]> a && v[i]<b ) {
				System.out.println(v[i]+ " ");
			}
			System.out.println();
		}
	
	}
//////////////////////////////////////////////	
		
		public static void rotaValor (int v[]) {
	
			int aux= v[0];
			for (int i = 0; i < v.length; i++) {
		
				
				v[i]= v[i-1];
			}
				v[v.length-1]= aux;
				
				
				
			}
//////////////////////////////////////////
		//creada en el ejercicio4 para rotar hacia la izquierda
		
		public static void rotarIzquierda(int vector[]) {
			int aux=vector[0];
			
			for (int i=0;i<vector.length-1; i++) { //si aqui pongo i=1, vector.length ,i++
				vector [i]=vector[i+1];//aquí seria entonces i-1 = vector[i]
		
			}
		vector 	[vector.length-1]=aux; //para acceder a la última casilla (aquí seria sin -1
			
		}

			//creo la misma función y dentro de esta función llamo a la de arriba:
		
		public static void rotarIzquierda(int vector[], int veces) {
			for (int i=0; i< veces; i++) {
				rotarIzquierda(vector); //aqui en vez de hacerlo de dentro del for invoco la fun dentro de esta función)
			}
		}
/////////////////////////////////////////////

			// Función rotar a la Drch

		public static void rotarDerecha(int vector[]) {
			int aux=vector[vector.length-1]; //porque voy al revés
	
	for (int i=vector.length ;i>0; i--) { 
		vector [i]=vector[i-1];

	}
		vector 	[0]=aux; 
		
		
		}


///////////////////////////////////////////
		public static void mostrarDesdeMayorA(int vector[], int num) {
			int i=0;
			for ( i =0; i< vector.length; i++) {
				if (vector[i]>=num) {
				
					break; //de esta forma cuando llegue a un valor true sale del
				}
			}
			for (int j=i;j<vector.length; j++) {
				System.out.print(vector [j]+ " ");// al poner + " " le estoy dando un espacion entre resultados
			
		}

	}
////////////////////////////////////

		public static boolean sonParalelos(double v1[], double v2[]) {
			
			if (v1.length !=v2.length) {   //si el tamaño es diferente se sale, ponerlo aquí red.códig
				return false;
			}
			
			boolean paralelos=true;
			double factor=v1[0]/v2[0];
			
			
			for (int i=1; i<v1.length;i++) {
				if (v1[i]/v2[i]!=factor && (v1[i]!=0 || v2[i]!=0)) {
					paralelos=false;
				}
			}
			return paralelos;
		}
	
		
//////////////////////////////////////////////
		public static boolean esCapicua(int vector[]) {
			boolean capicua =true;
			//for (int i=0,j=vector.length -1; i<j; i++,j--) {
			
			for (int i=0,j=vector.length -1; i< vector.length/2 && capicua; i++,j--) {//la mitad
				
				if (vector[i]!=vector[j]) {
					capicua=false;
			}
			
		}
		return capicua;
   }
		
//////////////////////////////////////////////
		public static int [] calcularInverso(int vector[]) {
			int resultado[] =new int [vector.length];
			for (int i=0, j=vector.length-1; i<vector.length; i++,j--) {
				resultado [i]=vector[j];
			}
		return resultado;
			
		}
//////////////////////////////////////////////
			
		public static int [] concatenar(int v1[], int v2[]) {
			int v3 []= new int [v1.length+v2.length];//inicialización del vector v3
			for (int i=0; i<v1.length; i++) {
				v3[i] =v1[i];
				
			}
			for (int i=0; i<v1.length;i++) {
				v3[v1.length+i]=v2[i];
			}
			
		return v3;	
		
		}
////////////////////////////////////////////////
		
		public static int []sumar (int v1[], int v2[]){
			if (v1.length!=v2.length) {
				return null; //cuidado no poner false
				
			}
			int v3 []=new int [v1.length];
			for (int i=0; i<v1.length; i++) {
				v3[i]= v1[i]+v2[i];
			}
			return v3;
			
		}
		
}