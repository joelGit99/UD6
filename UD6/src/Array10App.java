import javax.swing.JOptionPane;

public class Array10App {
	/**
	 * Programa que rellena un array a partir de los números pedidos por teclado
	 * Que luego muestra
	 * @author Joel
	 */
	public static void main(String[] args) {
		int[] array = new int[10];
		rellenarArray(array);
		mostrarArray(array);
	}
	
	// Método para rellenar el array a partir de los números pedidos por teclado
	public static void rellenarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			String num = JOptionPane.showInputDialog("Introduce el número de la posición" + i);
			int numInt = Integer.parseInt(num);
			array[i] = numInt;
		}
	}
	
	// Método que muestra el array
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
