package ejemplosherencia;

public class TestHerenciaVehiculo {

	public static void main(String[] args) {
		VehiculoHija miCoche = new VehiculoHija();
		miCoche.velocidadMaxima = 200;
		miCoche.modelo = 2022;
		miCoche.numPuertas = 4;

		miCoche.arrancar();
		miCoche.acelerar();
		miCoche.frenar();
	}
}
