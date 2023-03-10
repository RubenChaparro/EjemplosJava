package ejemploExcepciones;

public class TestFinallyAutoCloseable {
	public static void main(String[] args) throws Exception {

		// try con recursos instancia un objeto tiene que implementar la interfaz
		// AutoCloseable
		try (FinallyAutoCloseable con = new FinallyAutoCloseable()) {
			con.leerDatos();
			// El try con recursos tambien puede implementar un catch
		} catch (IllegalStateException e) {
			System.out.println("Ejecutando catch");
			e.printStackTrace();
		}

		/*
		 * 
		 * Conexion con = null;
		 * 
		 * try { con = new Conexion(); con.leerDatos();
		 * 
		 * } catch (IllegalStateException e) {
		 * System.out.println("Recibiendo exception"); e.printStackTrace();
		 * 
		 * // finaly nos ejecutara el codigo dentro de el aun si se captura o no l error
		 * } finally { System.out.println("Ejecutando finally"); con.cerrar(); }
		 * 
		 * }
		 */
	}
}
