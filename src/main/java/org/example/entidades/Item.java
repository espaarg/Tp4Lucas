package org.example.entidades;

/**
 * Clase que representa un item en el carrito de compras.
 */
public class Item {

    private String nombre = "Zapatilla"; // Nombre del item.
    private String descripcion = "De cuero"; // Descripción del item.
    private int cantidad = 2; // Cantidad del item.
    private float precio = 100; // Precio del item.
    private float precioCantidad = 200; // Precio total calculado.

    /**
     * Constructor vacío para Item.
     */
    public Item() {
    }

    /**
     * Obtiene el nombre del item.
     *
     * @return El nombre del item.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del item.
     *
     * @param nombre El nombre a establecer.
     */
    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del item.
     *
     * @return La descripción del item.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del item.
     *
     * @param descripcion La descripción a establecer.
     */
    public void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la cantidad del item.
     *
     * @return La cantidad del item.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del item.
     *
     * @param cantidad La cantidad a establecer.
     */
    public void setCantidad(final int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el precio del item.
     *
     * @return El precio del item.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del item.
     *
     * @param precio El precio a establecer.
     */
    public void setPrecio(final float precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el precio total calculado.
     *
     * @return El precio total.
     */
    public float getPrecioCantidad() {
        return precioCantidad;
    }

    /**
     * Establece el precio total basado en la cantidad y el precio unitario.
     *
     * @param precio El precio unitario.
     */
    public void setPrecioCantidad(final float precio) {
        this.precioCantidad = cantidad * precio;
    }

    /**
     * Incrementa la cantidad en uno.
     */
    public void anadirUnoCantidad() {
        cantidad++;
    }

    /**
     * Disminuye la cantidad en uno.
     */
    public void disminuirUnoCantidad() {
        cantidad--;
    }
}
