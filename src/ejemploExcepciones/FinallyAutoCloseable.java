package ejemploExcepciones;

public class FinallyAutoCloseable implements AutoCloseable {

	public FinallyAutoCloseable() {
		System.out.println("Abriendo conexion");
		// throw new IllegalStateException();
	}

	public void leerDatos() {
		System.out.println("Recibiendo datos");
		throw new IllegalStateException();
	}

	public void cerrar() {
		System.out.println("Cerrando conexion");
	}

	// con este metodo al finalizar automaticamente llama al metodo close()
	@Override
	public void close() throws Exception {
		cerrar();

	}
}
