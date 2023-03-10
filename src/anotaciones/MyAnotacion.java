package anotaciones;

/* En este código, estamos definiendo una anotación llamada "@Test" que tiene 
 * un único atributo llamado "description" de tipo String, el cual es opcional 
 * y tiene un valor predeterminado de cadena vacía. La anotación se puede aplicar 
 * solo a métodos y se conserva en tiempo de ejecución.
 */
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface MyAnotacion {
	String description() default "";

}
