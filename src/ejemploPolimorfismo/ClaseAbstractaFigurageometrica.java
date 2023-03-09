package ejemploPolimorfismo;

/* En este ejemplo, la clase abstracta FiguraGeometrica tiene un constructor que inicializa 
 * el nombre de la figura geométrica, un método getNombre() para obtener el nombre, y un 
 * método toString() que devuelve una representación en formato de cadena de la figura geométrica.
 * Cualquier clase que herede de FiguraGeometrica debe implementar los métodos abstractos area() y perimetro(). 
 * Además, la clase derivada puede acceder al nombre a través del método getNombre(). Este ejemplo 
 * muestra cómo las clases abstractas pueden tener campos y métodos no abstractos, además de los 
 * métodos abstractos. También demuestra cómo las clases derivadas pueden usar los campos y métodos 
 * no abstractos definidos en la clase abstracta.
 */

public abstract class ClaseAbstractaFigurageometrica {

	private String nombre;

	public ClaseAbstractaFigurageometrica(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public abstract double area();

	public abstract double perimetro();

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Área: " + area() + ", Perímetro: " + perimetro();
	}
}
