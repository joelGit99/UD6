import javax.swing.JOptionPane;

public class NumeroPrimoApp {
	/**
	 * Programa que determina si un n�mero es primo o no
	 * @author Joel
	 */
	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Introduce el n�mero");
		int numero2 = Integer.parseInt(numero);
		
		// Llamo al m�todo para decir si el n�mero es primo o no
		if(esPrimo(numero2)) {
			JOptionPane.showMessageDialog(null, "Es primo");
		} else if(!esPrimo(numero2)) {
			JOptionPane.showMessageDialog(null, "No es primo");
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

}
