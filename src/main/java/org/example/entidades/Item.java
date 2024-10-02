package org.example.entidades;

/**
 * Representa un item en el carrito de compras.
 */
public class Item {

    private String nombre = "Zapatilla";
    private String descripcion = "De cuero";
    private int cantidad = 2;
    private float precio = 100;
    private float precioCantidad = 200;

    /**
     * Constructor vacío de la clase Item.
     */
    public Item() {
        // Constructor vacío
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
    public void setNombre(String nombre) {
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
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la cantidad de items.
     *
     * @return La cantidad de items.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de items.
     *
     * @param cantidad La cantidad a establecer.
     * @throws IllegalArgumentException si la cantidad es negativa.
     */
    public void setCantidad(int cantidad) {
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
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el precio total basado en la cantidad y el precio del item.
     *
     * @return El precio total del item multiplicado por la cantidad.
     */
    public float getPrecioCantidad() {
        return precioCantidad;
    }

    /**
     * Establece el precio total basado en la cantidad y el precio.
     *
     * @param precio El precio unitario del item.
     */
    public void setPrecioCantidad(float precio) {
        this.precioCantidad = cantidad * precio;
    }

    /**
     * Incrementa la cantidad de items en 1.
     */
    public void anadirUnoCantidad() {
        cantidad++;
    }

    /**
     * Disminuye la cantidad de items en 1.
     */
    public void disminuirUnoCantidad() {
        if (cantidad > 0) {
            cantidad--;
        } else {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
    }
}
