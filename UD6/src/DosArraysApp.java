import java.util.Random;

import javax.swing.JOptionPane;

public class DosArraysApp {
	/**
	 * Programa que rellena arrays y los muestra, uno de los arrays rellenado con los resultados de
	 * las multiplicaciones entre las posiciones de los dos arrays
	 * @author Joel
	 */
	public static void main(String[] args) {
		String length = JOptionPane.showInputDialog("Introduce el tamaño de los array");
		int lengthInt = Integer.parseInt(length);
		
		int[] array1 = new int[lengthInt];
		int[] array2 = new int[lengthInt];
		
		rellenarArray(array1, array2);
		mostrarArray(array1, array2, arrayMultiplicacion(array1, array2));
	}
	
	// Método para rellenar el array con numeros aleatorios
	public static void rellenarArray(int[] array1, int[] array2) {
		Random random = new Random();
			
		for (int i = 0; i < array1.length; i++) {
			array1[i] = random.nextInt();
			array2[i] = random.nextInt();
		}
	}
	
	// Crea un nuevo array a partir de la multiplicación entre los valores de cada posicion entre los dos arrays
	public static int[] arrayMultiplicacion(int[] array1, int[] array2) {
		int[] multArray = new int[array1.length];
		for (int i = 0; i < multArray.length; i++) {
			multArray[i] = array1[i] *  array2[i];
		}
		
		return multArray;
	}
	
	// Método que muestra el array
		public static void mostrarArray(int[] array1, int[] array2, int[] array3) {
			for (int i = 0; i < array1.length; i++) {
				System.out.print(array1[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < array2.length; i++) {
				System.out.print(array2[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < array3.length; i++) {
				System.out.print(array3[i] + " ");
			}
		}

}
