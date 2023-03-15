package ejemplosCollections;

import java.util.Objects;
import java.util.Comparator;

public class Moto {

    private String modelo;
    private String color;

    public Moto(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*
     * Podemos generar un toString automaticamente para que
     * al llamar la impresion del objeto salga en formato String
     */
    @Override
    public String toString() {
        return "{" +
                " modelo='" + getModelo() + "'" +
                ", color='" + getColor() + "'" +
                "}";
    }

    /*
     * Con estos dos metodos sobreesccritos le decimos 
     * que compare los atributos de los objetos creados en la lista.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Moto moto = (Moto) o;
        return Objects.equals(modelo, moto.modelo) && Objects.equals(color, moto.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, color);
    }
}
