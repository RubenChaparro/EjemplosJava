package ejemploPolimorfismo;

/* Para utilizar una clase util en tu programa, simplemente importa la clase y llama a sus métodos 
 * estáticos. En este ejemplo, importamos la clase MiUtil y llamamos a su método calcularPromedio 
 * para calcular el promedio de un arreglo de números.
 */
public class TestClaseUtil {
	public static void main(String[] args) {
		double[] numeros = { 2.0, 4.0, 6.0, 8.0, 10.0 };
		double promedio = ClasesUtiles.calcularPromedio(numeros);
		System.out.println("El promedio es: " + promedio);
	}
}
