package es.iestriana.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Explicacion {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Unidimensionales
		int [] numeros = new int[10];
		
		// Multidimensionales
		float [][] temperaturas = new float[5][6];
		
		int [] datos = {1,2,3,4,5};
		System.out.println(datos.length);
		
		//int [][] valores = new int[3][3];
		int [][] valores = {{1,2,3},{4,5,6},{7,8,9}};
		
		String [][] cadenas = {{"cad1", "cad2"},{"cad3","cad4"}};
		System.out.println(cadenas[0][1]);
		
		
		int n = valores[1][2];
		int n1 = numeros[3];
		
		cadenas[0][1] = "cadena2";
		valores[1][1]++;
		valores[0][0] = valores[0][1] + valores[0][2];
		numeros[0]--;
		numeros[1] = numeros[2] * numeros[3];		

		for (int i = 0; i < numeros.length; i++) {
			//System.out.println("N�: ");
			//numeros[i] = sc.nextInt();
			numeros[i] = new Random().nextInt(20)+1;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		// N�mero de repeticiones de un n�mero en la tabla
		System.out.println("N� BUSCADO: ");
		int buscado = sc.nextInt();
		
		int veces = calcularRepeticiones(numeros, buscado);
		
		System.out.println("El n�mero " + buscado + 
				" se repite en la tabla " + veces + " veces");

		for (int i = 0; i < cadenas.length; i++) {
			for (int j = 0; j < cadenas[i].length; j++) {
				System.out.println(cadenas[i][j]);
			}
		}

		for (int i = 0; i < temperaturas.length; i++) {
			for (int j = 0; j < temperaturas[i].length; j++) {
				System.out.print("(" + i + "," + j + ") ");				
			}
			System.out.println();
		}
		
		System.out.println(Arrays.toString(numeros));
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		//Arrays.fill(numeros, 0);
		Arrays.binarySearch(numeros, 3);
		int [] auxiliar = Arrays.copyOf(numeros, 14);
		System.out.println(Arrays.toString(auxiliar));
		sc.close();
	}

	private static int calcularRepeticiones(int[] numeros, int buscado) {
		int repeticiones = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]==buscado) {
				repeticiones++;
			}
		}
		
		return repeticiones;
	}

	
	
	
	
	
}