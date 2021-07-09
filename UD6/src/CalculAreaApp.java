import javax.swing.JOptionPane;

public class CalculAreaApp {
	/**
	 * Programa que calcula el área del círculo, triángulo o cuadrado
	 * @author Joel
	 */
	public static void main(String[] args) {
		String figura = JOptionPane.showInputDialog("Introduce la figura");
		
		// Si pone circulo, le pedimos el radio, y a partir de eso, calculamos el área
		if(figura.equalsIgnoreCase("Circulo")) {
			String radio = JOptionPane.showInputDialog("Introduce el radio");
			double radio2 = Double.parseDouble(radio);
			JOptionPane.showMessageDialog(null, "El área del circulo es " + areaCirculo(radio2));
		// Si pide triangulo, le pedimos base y altura para calcular el area
		} else if(figura.equalsIgnoreCase("Triangulo")) {
			String base = JOptionPane.showInputDialog("Introduce la base");
			String altura = JOptionPane.showInputDialog("Introduce la altura");
			double base2 = Double.parseDouble(base);
			double altura2 = Double.parseDouble(altura);
			JOptionPane.showMessageDialog(null, "El área del triangulo es " + areaTriangulo(base2,altura2));
		// Igual que los anteriores, pero con el cuadrado, y solo pedimos el lado para calcular
		} else if(figura.equalsIgnoreCase("Cuadrado")) {
			String lado = JOptionPane.showInputDialog("Introduce el lado");
			double lado2 = Double.parseDouble(lado);
			JOptionPane.showMessageDialog(null, "El área del cuadrado es " + areaCuadrado(lado2));
		}
	}
	
	// Método para calcular el área del circulo
	public static double areaCirculo(double radio) {
		double area = (Math.pow(radio, 2)) * Math.PI;
		return area;
	}
	
	// Método para calcular el área del triangulo
	public static double areaTriangulo(double base, double altura) {
		double area = (base * altura) / 2;
		return area;
	}
	
	// Método para calcular el área del cuadrado
	public static double areaCuadrado(double lado) {
		double area = lado * lado;
		return area;
	}

}
