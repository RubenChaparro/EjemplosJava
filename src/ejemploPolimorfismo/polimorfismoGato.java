package ejemploPolimorfismo;

public class polimorfismoGato extends PoliformismoPet {
	public polimorfismoGato(String nombre) {
        super(nombre);
    }
    
    @Override
    public void moverse() {
        System.out.println(getNombre() + " está saltando.");
    }
}
