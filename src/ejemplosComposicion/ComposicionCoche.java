package ejemplosComposicion;

public class ComposicionCoche {
	private String marca;
    private String modelo;
    /*
     En este ejemplo, la clase Coche tiene un miembro llamado "motor" 
     que es un objeto de la clase Motor.
      
    */
    private ComposicionMotor motor;

    public ComposicionCoche(String marca, String modelo, ComposicionMotor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public ComposicionMotor getMotor() {
        return motor;
    }
}



