
import javax.swing.JOptionPane;

public class BinarioApp {
	/**
	 * Programa que convierte un n�mero a binario
	 * @author Joel
	 */
	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Introduce un n�mero decimal");
		double num = Double.parseDouble(numero);
		
		numBinario(num);
	}
	
	// M�todo que convierte el n�mero en binario
	public static void numBinario(double num) {
		double numDivision = num;
		for (int i = 0; (numDivision / 2) >= 0; i++) {
			numDivision = numDivision / 2;
			String numeroBinario = Integer.toString(((int)numDivision % 2));
			System.out.println(numeroBinario);
		}
	}

}
