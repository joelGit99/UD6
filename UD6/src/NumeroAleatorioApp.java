
import javax.swing.JOptionPane;

public class NumeroAleatorioApp {
	/**
	 * Programa que genera números aleatorios entre dos rangos
	 * @author Joel
	 */
	public static void main(String[] args) {
		// Pido los dos números
		String num1 = JOptionPane.showInputDialog("Introduce el primer número");
		String num2 = JOptionPane.showInputDialog("Introduce el segundo número");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		// Pido la cantidad
		String cantidad = JOptionPane.showInputDialog("Introduce la cantidad");
		int cantidad2 = Integer.parseInt(cantidad);
		
		// Genero el número aleatorio el número de veces igual a la cantidad
		for (int i = 0; i < cantidad2; i++) {
			JOptionPane.showMessageDialog(null, numAleatorio(n1, n2));
		}	
	}
	
	// Método que genera un número aleatorio
	public static int numAleatorio(int n1, int n2) {
		return (int) (Math.random() * (n1 - n2 - 1) + (n2)) + 1;
	}

}
