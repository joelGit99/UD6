import javax.swing.JOptionPane;

public class CalculAreaApp {
	/**
	 * Programa que calcula el �rea del c�rculo, tri�ngulo o cuadrado
	 * @author Joel
	 */
	public static void main(String[] args) {
		String figura = JOptionPane.showInputDialog("Introduce la figura");
		
		// Si pone circulo, le pedimos el radio, y a partir de eso, calculamos el �rea
		if(figura.equalsIgnoreCase("Circulo")) {
			String radio = JOptionPane.showInputDialog("Introduce el radio");
			double radio2 = Double.parseDouble(radio);
			JOptionPane.showMessageDialog(null, "El �rea del circulo es " + areaCirculo(radio2));
		// Si pide triangulo, le pedimos base y altura para calcular el area
		} else if(figura.equalsIgnoreCase("Triangulo")) {
			String base = JOptionPane.showInputDialog("Introduce la base");
			String altura = JOptionPane.showInputDialog("Introduce la altura");
			double base2 = Double.parseDouble(base);
			double altura2 = Double.parseDouble(altura);
			JOptionPane.showMessageDialog(null, "El �rea del triangulo es " + areaTriangulo(base2,altura2));
		// Igual que los anteriores, pero con el cuadrado, y solo pedimos el lado para calcular
		} else if(figura.equalsIgnoreCase("Cuadrado")) {
			String lado = JOptionPane.showInputDialog("Introduce el lado");
			double lado2 = Double.parseDouble(lado);
			JOptionPane.showMessageDialog(null, "El �rea del cuadrado es " + areaCuadrado(lado2));
		}
	}
	
	// M�todo para calcular el �rea del circulo
	public static double areaCirculo(double radio) {
		double area = (Math.pow(radio, 2)) * Math.PI;
		return area;
	}
	
	// M�todo para calcular el �rea del triangulo
	public static double areaTriangulo(double base, double altura) {
		double area = (base * altura) / 2;
		return area;
	}
	
	// M�todo para calcular el �rea del cuadrado
	public static double areaCuadrado(double lado) {
		double area = lado * lado;
		return area;
	}

}
