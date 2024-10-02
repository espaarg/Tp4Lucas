package org.example.entidades;

/**
 * Clase que representa un item en el carrito de compras.
 */
public class Item {

    /** Nombre del item. */
    private String nombre;

    /** Descripción del item. */
    private String descripcion;

    /** Cantidad del item. */
    private int cantidad = 2;

    /** Precio del item. */
    private float precio = 2;

    /** Constante que define el límite superior de cantidad. */
    private static final int MAX_CANTIDAD = 100;

    /** Constante que define el precio mínimo. */
    private static final float MIN_PRECIO = 10.0f;

    /** Precio total calculado. */
    private static final float PRECIO_CANTIDAD_INICIAL = 4; // Definición

    /** Precio total calculado de verdad. */
    private float precioCantidad = PRECIO_CANTIDAD_INICIAL;

    /**
     * Constructor para la clase Item.
     *
     * @param newNombre      Nombre del item.
     * @param newDescripcion Descripción del item.
     * @param newCantidad    Cantidad del item.
     * @param newPrecio      Precio del item.
     */
    public Item(final String newNombre, final String newDescripcion,
                final int newCantidad, final float newPrecio) {
        this.nombre = newNombre;
        this.descripcion = newDescripcion;
        setCantidad(newCantidad);
        setPrecio(newPrecio);
    }

    /**
     * Constructor vacío para la clase Item.
     */
    public Item() {
        // Constructor vacío
    }

    /**
     * Obtiene el nombre del item.
     *
     * @return Nombre del item.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del item.
     *
     * @param newNombre Nombre del item.
     */
    public void setNombre(final String newNombre) {
        this.nombre = newNombre;
    }

    /**
     * Obtiene la descripción del item.
     *
     * @return Descripción del item.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del item.
     *
     * @param newDescripcion Descripción del item.
     */
    public void setDescripcion(final String newDescripcion) {
        this.descripcion = newDescripcion;
    }

    /**
     * Obtiene la cantidad del item.
     *
     * @return Cantidad del item.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del item.
     *
     * @param newCantidad Cantidad del item.
     * @throws IllegalArgumentException si la cantidad es negativa o superior a
     * MAX_CANTIDAD.
     */
    public void setCantidad(final int newCantidad) {
        if (newCantidad < 0 || newCantidad > MAX_CANTIDAD) {
            throw new IllegalArgumentException("La cantidad debe estar "
                    + "entre 0 y "
                    + MAX_CANTIDAD);
        }
        this.cantidad = newCantidad;
    }

    /**
     * Obtiene el precio del item.
     *
     * @return Precio del item.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del item.
     *
     * @param newPrecio Precio del item.
     * @throws IllegalArgumentException si el precio es menor a MIN_PRECIO.
     */
    public void setPrecio(final float newPrecio) {
        if (newPrecio < MIN_PRECIO) {
            throw new IllegalArgumentException("El precio debe ser mayor a "
                    + MIN_PRECIO);
        }
        this.precio = newPrecio;
    }

    /**
     * Obtiene el precio por cantidad del item.
     *
     * @return Precio por cantidad.
     */
    public float getPrecioCantidad() {
        return precio * cantidad;
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
        if (cantidad > 0) {
            cantidad--;
        } else {
            throw new IllegalArgumentException("La cantidad no puede ser "
                                                + "negativa.");
        }
    }

    /**
     * Establece el precio total basado en la cantidad y el precio unitario.
     *
     * @param newPrecio El precio unitario.
     */
    public void setPrecioCantidad(final float newPrecio) {
        this.precioCantidad = newPrecio;
    }
}
