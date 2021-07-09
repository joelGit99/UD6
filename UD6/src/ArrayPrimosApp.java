
import javax.swing.JOptionPane;

public class ArrayPrimosApp {
	/**
	 * Programa que rellena un array con n�meros primos entre dos valores, y que luego muestra el n�mero m�s grande
	 * @author Joel
	 */
	public static void main(String[] args) {
		String length = JOptionPane.showInputDialog("Introduce el tama�o del array");
		int lengthInt = Integer.parseInt(length);
		int[] array = new int[lengthInt];

		rellenarArray(0, 5, array);
		mostrarArray(array);
	}

	// M�todo para rellenar el array con numeros primos entre los valores pasados por par�metro
	public static void rellenarArray(int min, int max, int[] array) {

		for (int i = 0; i < array.length; i++) {
			String num = JOptionPane.showInputDialog("Introduce el n�mero de la posici�n" + i + " (tiene que estar entre " + min + " y " + max + " y tiene que ser primo)");
			int numInt = Integer.parseInt(num);
			while(numInt <= min || numInt >= max || !esPrimo(numInt)) {
				num = JOptionPane.showInputDialog("Introduce el n�mero de la posici�n" + i + " (tiene que estar entre " + min + " y " + max + ")");
				numInt = Integer.parseInt(num);
				if(numInt > min && numInt < max && esPrimo(numInt)) {
					array[i] = numInt;
				}
			}
		}
	}

	// M�todo para comprobar si un n�mero es primo o no
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
	
	// M�todo que muestra el array
		public static void mostrarArray(int[] array) {
			int numMasGrande = 0;
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
				if(array[i] > numMasGrande) {
					numMasGrande = array[i];
				}
			}
			System.out.println();
			System.out.println("El n�mero m�s grande es " +  numMasGrande);
		}



}
