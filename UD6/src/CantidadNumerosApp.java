import javax.swing.JOptionPane;

public class CantidadNumerosApp {
	/**
	 * Programa que cuenta el número de cifras que tiene un número entero
	 * @author Joel
	 */
	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Introduce un número decimal");
		int numero2 = Integer.parseInt(numero);
		while(numero2 < 0) {
			numero = JOptionPane.showInputDialog("Introduce un número decimal");
			numero2 = Integer.parseInt(numero);
		}

		JOptionPane.showMessageDialog(null, numero2 + " tiene " + numCifras(numero2) + " cifras");
	}
	
	// Método que cuenta las cifras del número entero
	public static int numCifras(int numero) {
		int cifras = 0;
		while(numero != 0) {
			numero = numero / 10;
			cifras++;
		}
		return cifras;
	}

}
