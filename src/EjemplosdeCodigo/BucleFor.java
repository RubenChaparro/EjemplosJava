package ejemplosdeCodigo;

public class BucleFor {
	public static void main(String[] args) {
		
		/*
		  Este ejemplo muestra un ciclo for básico que imprime los valores de la variable i 
		  mientras esta sea menor que 10. El cuerpo del bucle se ejecuta 10 veces, una vez 
		  para cada valor de i.
		*/
		
		for (int i = 0; i < 10; i++) {
		    System.out.println("El valor de i es: " + i);
		}

		/*
		  Este ejemplo muestra un ciclo for que utiliza dos variables de control, i y j, 
		  que se inicializan en 0 y 10 respectivamente. El bucle se ejecutará mientras i 
		  sea menor que j, y en cada iteración se incrementará i y se decrementará j. 
		  El cuerpo del bucle imprimirá los valores de ambas variables en cada iteración.
		*/
		
		for (int i = 0, j = 10; i <= j; i++, j--) {
		    System.out.println("El valor de i es: " + i + " y el valor de j es: " + j);
		}

		/*
		  Este ejemplo muestra un ciclo for que utiliza una expresión booleana como condición 
		  en lugar de una comparación numérica. El bucle se ejecutará mientras la variable 
		  booleana condicion sea verdadera. En cada iteración, el cuerpo del bucle imprimirá 
		  el valor de i, y cuando i llegue a 10, se cambiará el valor de condicion a falso, 
		  lo que hará que el bucle termine.
		*/
		
		boolean condicion = true;
		for (int i = 0; condicion; i++) {
		    System.out.println("El valor de i es: " + i);
		    if (i == 10) {
		        condicion = false;
		    }
		}

		/*
		  Este ejemplo muestra un ciclo for-each que utiliza una matriz bidimensional. 
		  El bucle exterior recorre las filas de la matriz, y el bucle interior recorre 
		  los valores de cada fila. En cada iteración del bucle interior, se imprime el 
		  valor correspondiente, y después de recorrer todos los valores de una fila, 
		  se imprime un salto de línea para pasar a la siguiente fila.
		*/
		
		int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		for (int[] fila : matriz) {
		    for (int valor : fila) {
		        System.out.print(valor + " ");
		    }
		    System.out.println();
		}

		/*
		  En este ejemplo, se utiliza un ciclo for para iterar sobre los números del 1 al 10. 
		  Dentro del cuerpo del ciclo, se utilizan las instrucciones continue y break para 
		  saltar la iteración cuando i es igual a 5 y salir del ciclo cuando i es igual a 8, 
		  respectivamente. La instrucción continue hace que el ciclo salte la iteración actual 
		  y continúe con la siguiente iteración. En este caso, cuando i es igual a 5, se salta 
		  la iteración y se continúa con la siguiente iteración.La instrucción break hace que 
		  el ciclo salga inmediatamente del ciclo. En este caso, cuando i es igual a 8, se sale 
		  del ciclo y se termina la ejecución del ciclo. En cada iteración del ciclo, se imprime 
		  el valor de i en la consola utilizando el método println() de la clase System. 
		  El resultado de este código sería la impresión de los números del 1 al 4 en la consola,
		  seguido por la impresión del número 6 y, finalmente, la ejecución del ciclo se detendría 
		  cuando i es igual a 8
		*/
		
			for (int i = 1; i <= 10; i++) {
			  if (i == 5) {
			    continue; // Salta la iteración cuando i es igual a 5
			  }
			  if (i == 8) {
			    break; // Sale del ciclo cuando i es igual a 8
			  }
			  System.out.println(i);
			}
		
		/*
		  En este ejemplo, el ciclo for se ejecutará continuamente sin una condición de finalización 
		  explícita. El cuerpo del ciclo puede contener cualquier tipo de instrucción, como entrada 
		  de datos, procesamiento de datos o salida de resultados. Se recomienda utilizarlos con precaución 
		  y asegurarse de que haya una forma de salir del ciclo en algún momento.
		*/
		
		//for (;;) {
			  // Cuerpo del ciclo
		//	}

	}
}
