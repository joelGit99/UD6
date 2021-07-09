import javax.swing.JOptionPane;

public class FactorialApp {
	/**
	 * Programa para calcular el factorial
	 * @author Joel
	 */
	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Introduce el número");
		int numero2 = Integer.parseInt(numero);
		
		JOptionPane.showMessageDialog(null, "El factorial es " + factorial(numero2));
	}
	
	// Método para calcular el factorial
	public static int factorial(int numero) {
		int factorial = numero * (numero - 1);
		for (int i = numero - 2; i > 0; i--) {
			factorial = factorial * i;
			
		}
		return factorial;
	}

}
