package ejemploMetodoStatic;

/* En este ejemplo, la clase abstracta Animal tiene un método estático llamado crear() que devuelve 
 * una instancia de una subclase de Animal, dependiendo del tipo de animal que se le pase como argumento. 
 * Las subclases Perro y Gato implementan el método hacerSonido() de manera diferente, y se puede llamar 
 * a este método en cualquier instancia de una subclase de Animal, incluida la que se devuelve desde el 
 * método crear().
 */
public abstract class Animal {

	public static Animal crear(String tipo) {
		if (tipo.equals("perro")) {
			return new Perro();
		} else if (tipo.equals("gato")) {
			return new Gato();
		} else {
			throw new IllegalArgumentException("Tipo de animal desconocido: " + tipo);
		}
	}

	public abstract void hacerSonido();
}
