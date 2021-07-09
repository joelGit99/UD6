
import javax.swing.JOptionPane;

public class ArrayPrimosApp {
	/**
	 * Programa que rellena un array con números primos entre dos valores, y que luego muestra el número más grande
	 * @author Joel
	 */
	public static void main(String[] args) {
		String length = JOptionPane.showInputDialog("Introduce el tamaño del array");
		int lengthInt = Integer.parseInt(length);
		int[] array = new int[lengthInt];

		rellenarArray(0, 5, array);
		mostrarArray(array);
	}

	// Método para rellenar el array con numeros primos entre los valores pasados por parámetro
	public static void rellenarArray(int min, int max, int[] array) {

		for (int i = 0; i < array.length; i++) {
			String num = JOptionPane.showInputDialog("Introduce el número de la posición" + i + " (tiene que estar entre " + min + " y " + max + " y tiene que ser primo)");
			int numInt = Integer.parseInt(num);
			while(numInt <= min || numInt >= max || !esPrimo(numInt)) {
				num = JOptionPane.showInputDialog("Introduce el número de la posición" + i + " (tiene que estar entre " + min + " y " + max + ")");
				numInt = Integer.parseInt(num);
				if(numInt > min && numInt < max && esPrimo(numInt)) {
					array[i] = numInt;
				}
			}
		}
	}

	// Método para comprobar si un número es primo o no
	public static boolean esPrimo(int numero) {

		if (numero <= 1) {
			return false;
		}

		int contador = 0;

		//bucle que cuenta los numeros divisibles
		for (int i = (int) Math.sqrt(numero); i > 1; i--) {
			if (numero % i == 0) {
				contador++;
			}
		}

		return contador < 1;
	}
	
	// Método que muestra el array
		public static void mostrarArray(int[] array) {
			int numMasGrande = 0;
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
				if(array[i] > numMasGrande) {
					numMasGrande = array[i];
				}
			}
			System.out.println();
			System.out.println("El número más grande es " +  numMasGrande);
		}



}
