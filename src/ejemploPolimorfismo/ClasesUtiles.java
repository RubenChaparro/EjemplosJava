package ejemploPolimorfismo;

/* En este ejemplo, la clase MiUtil tiene un método estático llamado calcularPromedio 
 * que acepta un arreglo de números y devuelve el promedio de esos números. Este método 
 * se puede llamar desde cualquier parte del programa sin tener que crear una instancia 
 * de la clase MiUtil.
 */
public class ClasesUtiles {
	public static double calcularPromedio(double[] numeros) {
		double suma = 0;
		for (double num : numeros) {
			suma += num;
		}
		return suma / numeros.length;
	}
}
