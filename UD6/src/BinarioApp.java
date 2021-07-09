
import javax.swing.JOptionPane;

public class BinarioApp {
	/**
	 * Programa que convierte un número a binario
	 * @author Joel
	 */
	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Introduce un número decimal");
		double num = Double.parseDouble(numero);
		
		numBinario(num);
	}
	
	// Método que convierte el número en binario
	public static void numBinario(double num) {
		double numDivision = num;
		for (int i = 0; (numDivision / 2) >= 0; i++) {
			numDivision = numDivision / 2;
			String numeroBinario = Integer.toString(((int)numDivision % 2));
			System.out.println(numeroBinario);
		}
	}

}
