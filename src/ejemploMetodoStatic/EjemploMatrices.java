package ejemploMetodoStatic;

import java.util.Arrays;

/* En este ejemplo, la clase EjemploMatrices tiene un método estático llamado imprimirMatriz() 
 * que toma una matriz de enteros como argumento y la imprime en la consola. Este método es 
 * útil para cualquier matriz que se quiera imprimir, independientemente de su contenido, 
 * y se puede llamar directamente desde la clase EjemploMatrices sin crear una instancia de 
 * la misma.
 */
public class EjemploMatrices {

	public static void imprimirMatriz(int[][] matriz) {
		for (int[] fila : matriz) {
			System.out.println(Arrays.toString(fila));
		}
	}
}
