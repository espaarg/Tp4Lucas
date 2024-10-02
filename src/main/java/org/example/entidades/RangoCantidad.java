package org.example.entidades;

/**
 * Esta clase maneja el rango de cantidades.
 */
public class RangoCantidad {

    /**
     * Cantidad que se utiliza para verificar límites.
     */
    int cant;

    private static final int MAX_CANTIDAD = 15; // Definido como constante

    /**
     * Este método nos asegura que la cantidad no supere la máxima.
     */
    public boolean cantidadMaxima() {
        return cant <= MAX_CANTIDAD;
    }

    /**
     * Este método nos asegura que la cantidad no sea negativa.
     */
    public boolean cantidadMinima() {
        return cant >= 0;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(final int cantidad) {
        this.cant = cantidad;
    }
}
