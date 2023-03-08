package ejemploPolimorfismo;

public class PolimorfismoPerro extends PoliformismoPet {
	
	public PolimorfismoPerro(String nombre) {
        super(nombre);
    }
    
    @Override
    public void moverse() {
        System.out.println(getNombre() + " está corriendo.");
    }
}
