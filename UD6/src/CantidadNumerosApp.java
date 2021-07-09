import javax.swing.JOptionPane;

public class CantidadNumerosApp {
	/**
	 * Programa que cuenta el n�mero de cifras que tiene un n�mero entero
	 * @author Joel
	 */
	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Introduce un n�mero decimal");
		int numero2 = Integer.parseInt(numero);
		while(numero2 < 0) {
			numero = JOptionPane.showInputDialog("Introduce un n�mero decimal");
			numero2 = Integer.parseInt(numero);
		}

		JOptionPane.showMessageDialog(null, numero2 + " tiene " + numCifras(numero2) + " cifras");
	}
	
	// M�todo que cuenta las cifras del n�mero entero
	public static int numCifras(int numero) {
		int cifras = 0;
		while(numero != 0) {
			numero = numero / 10;
			cifras++;
		}
		return cifras;
	}

}
