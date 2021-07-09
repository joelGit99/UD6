
import javax.swing.JOptionPane;

public class NumeroAleatorioApp {
	/**
	 * Programa que genera n�meros aleatorios entre dos rangos
	 * @author Joel
	 */
	public static void main(String[] args) {
		// Pido los dos n�meros
		String num1 = JOptionPane.showInputDialog("Introduce el primer n�mero");
		String num2 = JOptionPane.showInputDialog("Introduce el segundo n�mero");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		// Pido la cantidad
		String cantidad = JOptionPane.showInputDialog("Introduce la cantidad");
		int cantidad2 = Integer.parseInt(cantidad);
		
		// Genero el n�mero aleatorio el n�mero de veces igual a la cantidad
		for (int i = 0; i < cantidad2; i++) {
			JOptionPane.showMessageDialog(null, numAleatorio(n1, n2));
		}	
	}
	
	// M�todo que genera un n�mero aleatorio
	public static int numAleatorio(int n1, int n2) {
		return (int) (Math.random() * (n1 - n2 - 1) + (n2)) + 1;
	}

}
