import java.util.Random;

import javax.swing.JOptionPane;

public class Array12App {

	public static void main(String[] args) {
		String length = JOptionPane.showInputDialog("Introduce el tamaño del array");
		int lengthInt = Integer.parseInt(length);
		int[] array = new int[lengthInt];
		
		rellenarArray(array);
		mostrarArray(array);
	}

	// Método para rellenar el array con numeros aleatorios
	public static void rellenarArray(int[] array) {
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(300) + 1;
		}
	}

	// Método que muestra el array, y suma sus valores y la muestra
	public static void mostrarArray(int[] array) {
		String numero = JOptionPane.showInputDialog("Introduce el número con el que quieres que terminen los números");
		int[] arrayNums = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			String arrayI = Integer.toString(array[i]);
			if(arrayI.endsWith(numero)) {
				arrayNums[i] = array[i];
				System.out.print(arrayNums[i] + " ");
			}

		}
	}

}
