package org.example.entidades;

/**
 * Esta clase maneja el rango de cantidades.
 */
public class RangoCantidad {

    /**
     * Cantidad que se utiliza para verificar límites.
     */
    private int cant; // Cambiado a private

    /**
     * Definido como constante para la cantidad máxima permitida.
     */
    private static final int MAX_CANTIDAD = 15; // Definido como constante

    /**
     * Este método nos asegura que la cantidad no supere la máxima.
     * @return true si la cantidad es menor o igual a la máxima;
     *         false en caso contrario.
     */
    public boolean cantidadMaxima() {
        return cant <= MAX_CANTIDAD;
    }

    /**
     * Este método nos asegura que la cantidad no sea negativa.
     * @return true si la cantidad es mayor o igual a cero;
     *         false en caso contrario.
     */
    public boolean cantidadMinima() {
        return cant >= 0;
    }

    /**
     * Obtiene la cantidad.
     * @return la cantidad actual.
     */
    public int getCant() {
        return cant;
    }

    /**
     * Establece la cantidad.
     * @param cantidad la nueva cantidad a establecer.
     */
    public void setCant(final int cantidad) {
        this.cant = cantidad;
    }
}
