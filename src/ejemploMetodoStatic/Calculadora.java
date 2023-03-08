package ejemploMetodoStatic;

/*Ejemplo de utilidades de clase
  En este ejemplo, la clase Calculadora tiene dos métodos estáticos: sumar() y calcularAreaCirculo(). 
  El método sumar() toma dos enteros como argumentos y devuelve su suma, mientras que el método 
  calcularAreaCirculo() toma el radio de un círculo como argumento y devuelve su área.
*/
public class Calculadora {
	public static int sumar(int a, int b) {
		return a + b;
	}

	public static double calcularAreaCirculo(double radio) {
		return Math.PI * radio * radio;
	}
}
