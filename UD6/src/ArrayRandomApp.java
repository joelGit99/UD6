import java.util.Random;

import javax.swing.JOptionPane;

public class ArrayRandomApp {
	/**
	 * Programa que rellena un array con números aleatorios entre 0 y 9
	 * Y luego lo muestra, junto la suma de cada uno de los valores
	 * @author Joel
	 */
	public static void main(String[] args) {
		String length = JOptionPane.showInputDialog("Introduce la longitud del array");
		int lengthInt = Integer.parseInt(length);
		int[] array = new int[lengthInt];
		rellenarArray(0, 9, array);
		mostrarArray(array);
	}
	
	// Método para rellenar el array con numeros aleatorios
	public static void rellenarArray(int min, int max, int[] array) {
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(9);
		}
	}
	
	// Método que muestra el array, y suma sus valores y la muestra
	public static void mostrarArray(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			suma = suma + array[i];
		}
		System.out.println();
		System.out.println("La suma es " + suma);
	}

}
