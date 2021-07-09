import javax.swing.JOptionPane;

public class ConversorMonedaApp {
	/**
	 * Programa que convierte a otra moneda
	 * @param args
	 */
	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Introduce una cantidad de euros");
		double cantidadEuros = Integer.parseInt(numero);
		String moneda = JOptionPane.showInputDialog("Introduce la moneda a la que quieres cambiar");
		
		conversorMoneda(cantidadEuros, moneda);
	}
	
	// Método que hace la conversión de la moneda
	public static void conversorMoneda(double cantidadEuros, String moneda) {
		if(moneda.equalsIgnoreCase("libras")) {
			cantidadEuros = cantidadEuros * 0.86;
			JOptionPane.showMessageDialog(null, cantidadEuros + " libras");
		} else if(moneda.equals("$")) {
			cantidadEuros = cantidadEuros * 1.28611;
			JOptionPane.showMessageDialog(null, cantidadEuros + " $");
		} else if(moneda.equalsIgnoreCase("yenes")) {
			cantidadEuros = cantidadEuros * 129.852;
			JOptionPane.showMessageDialog(null, cantidadEuros + " yenes");
		}
	}

}
