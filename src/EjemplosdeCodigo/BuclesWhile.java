package EjemplosdeCodigo;

import java.util.Scanner;

public class BuclesWhile {

	/* 
	   Ejemplo bucle while
	   Este ejemplo muestra un bucle while que imprime los valores de la variable i 
	   mientras esta sea menor que 10. En el cuerpo del bucle, se utiliza un if 
	   para saltar el valor 5 usando continue y otro if para salir del bucle cuando 
	   i es igual a 8 usando break.
	 */
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println("El valor de i es: " + i);
			i++;
			if (i == 5) {
				continue;
			}
			if (i == 8) {
				break;
			}
		}
		
		
		/* 
		   Ejemplo de bucle do-while:
		   Este ejemplo utiliza un bucle do-while para pedirle al usuario que introduzca un número positivo. 
		   El bucle se ejecutará al menos una vez, y luego se verificará si el número introducido es menor 
		   que cero. Si lo es, el bucle se volverá a ejecutar y se volverá a pedir al usuario que introduzca 
		   un número. Cuando se introduce un número positivo, el bucle termina y se imprime el número introducido.
		 */
		
		Scanner input = new Scanner(System.in);
		int num;
		do {
			System.out.print("Introduce un número positivo: ");
			num = input.nextInt();
		} while (num < 0);
		System.out.println("El número introducido es: " + num);

	}

}
