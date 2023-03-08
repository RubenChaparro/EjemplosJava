package ejemplosClase;

public class SobrecargaFigurasGeometricas {

	/*
	 * En este ejemplo, la clase FigurasGeometricas tiene dos métodos llamados
	 * calcularArea, pero uno toma un parámetro de tipo double para calcular el área
	 * de un círculo, mientras que el otro toma dos parámetros de tipo int para
	 * calcular el área de un rectángulo. En el método main, se llama a cada versión
	 * del método calcularArea pasando los argumentos apropiados, y los resultados
	 * se imprimen en la consola.
	 */
	public static void main(String[] args) {
		// Calcula el área de un círculo con radio de 5
		double areaCirculo = calcularArea(5.0);
		System.out.println("El área del círculo es: " + areaCirculo);

		// Calcula el área de un rectángulo con base de 4 y altura de 6
		int baseRectangulo = 4;
		int alturaRectangulo = 6;
		int areaRectangulo = calcularArea(baseRectangulo, alturaRectangulo);
		System.out.println("El área del rectángulo es: " + areaRectangulo);
	}

	// Método para calcular el área de un círculo
	public static double calcularArea(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}

	// Método para calcular el área de un rectángulo
	public static int calcularArea(int base, int altura) {
		return base * altura;
	}
}
