package ejemplosCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayLists {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    
    //Creando un ArrayList
    ArrayList<Moto> misMotos = new ArrayList<>();

    // Agregando elementos a un ArrayList
    misMotos.add(new Moto("Susuki", "Azul"));
    misMotos.add(new Moto("Honda", "Amarilla"));
    misMotos.add(new Moto("Raider", "Verde"));
    
    // Obteniendo el numero de elementos en el ArrayLIst
    System.out.println(misMotos.size());
    System.out.println(misMotos);
    
    // Removiendo todos los elementos del ArrayList
    //misMotos.remove(1);
    System.out.println(misMotos.size());
    System.out.println(misMotos);
    
    // Obteniendo el elemento en el indice proporcionado
    System.out.println(misMotos.get(1));
    
    // Obteniendo el indice del elemento (aqui usamos un metodo sobreescrito para logralo ya que no se puede comparar directamente los objetos)
    System.out.println(misMotos.indexOf(new Moto("Raider","Verde")));
    
    // Borrando los elementos del ArrayList
    //misMotos.clear();
    //System.out.println(misMotos);
    
    // Regresando un boolean si el ArrayList esta vacio
    System.out.println(misMotos.isEmpty());
    
    // Convierte el ArrayList en un string (en este caso no funciona ya que contiene objetos)
    //String[] arregloMotos = misMotos.toArray(new String[misMotos.size()]);
    //System.out.println(arregloMotos);

    // Compara si el objeto s enecuentra en el ArrayList y responde con un boolean
    System.out.println(misMotos.contains(new Moto("Susuki","Azul")));

    
}
}

