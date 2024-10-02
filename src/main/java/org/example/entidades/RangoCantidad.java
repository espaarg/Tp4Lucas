package org.example.entidades;

/**
 * Clase que representa un rango de cantidad.
 */
public class RangoCantidad {

    private int cant; // Variable que representa la cantidad.

    /**
     * Verifica si la cantidad no supera el valor máximo permitido.
     *
     * @return {@code true} si la cantidad es menor o igual a 15, {@code false} de lo contrario.
     */
    public boolean cantidadMaxima() {
        return cant <= 15;
    }

    /**
     * Verifica si la cantidad no es negativa.
     *
     * @return {@code true} si la cantidad es mayor o igual a 0, {@code false} de lo contrario.
     */
    public boolean cantidadMinima() {
        return cant >= 0;
    }

    /**
     * Obtiene la cantidad actual.
     *
     * @return La cantidad.
     */
    public int getCant() {
        return cant;
    }

    /**
     * Establece una nueva cantidad.
     *
     * @param cant La cantidad a establecer.
     */
    public void setCant(final int cant) {
        this.cant = cant;
    }
}
