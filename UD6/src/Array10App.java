import javax.swing.JOptionPane;

public class Array10App {
	/**
	 * Programa que rellena un array a partir de los n�meros pedidos por teclado
	 * Que luego muestra
	 * @author Joel
	 */
	public static void main(String[] args) {
		int[] array = new int[10];
		rellenarArray(array);
		mostrarArray(array);
	}
	
	// M�todo para rellenar el array a partir de los n�meros pedidos por teclado
	public static void rellenarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			String num = JOptionPane.showInputDialog("Introduce el n�mero de la posici�n" + i);
			int numInt = Integer.parseInt(num);
			array[i] = numInt;
		}
	}
	
	// M�todo que muestra el array
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
