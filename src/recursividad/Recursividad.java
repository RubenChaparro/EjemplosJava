package recursividad;

/* En este ejemplo, la función factorial se llama a sí misma para calcular el factorial de un número n. 
 * La función utiliza una condición de salida para detener la recursividad cuando n es igual a cero y 
 * devuelve un valor de 1. Si n es mayor que cero, la función se llama a sí misma con un argumento n - 1 y 
 * multiplica el resultado por n. Esta llamada recursiva se repite hasta que se alcanza la condición de salida 
 * y se devuelve el resultado final.
 */
public class Recursividad {
	

	    public static void main(String[] args) {
	        int numero = 5;
	        int resultado = factorial(numero);
	        System.out.println("El factorial de " + numero + " es " + resultado);
	    }

	    public static int factorial(int n) {
	        if (n == 0) {
	            return 1;
	        } else {
	            return n * factorial(n - 1);
	        }
	    }
	}


