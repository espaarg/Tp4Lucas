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
    private int cantidad=2;

    /** Precio del item. */
    private float precio=2;

    /** Constante que define el límite superior de cantidad. */
    private static final int MAX_CANTIDAD = 100;

    /** Constante que define el precio mínimo. */
    private static final float MIN_PRECIO = 10.0f;

    /** Precio total calculado. */
    private float precioCantidad = 200;


    /**
     * Constructor para la clase Item.
     *
     * @param nombre Nombre del item.
     * @param descripcion Descripción del item.
     * @param cantidad Cantidad del item.
     * @param precio Precio del item.
     */
    public Item(final String nombre, final String descripcion,
                final int cantidad, final float precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        setCantidad(cantidad);
        setPrecio(precio);
    }

    /**
     * Constructor vacio para la clase Item.
     */
    public Item() {
        
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
     * @param nombre Nombre del item.
     */
    public void setNombre(final String nombre) {
        this.nombre = nombre;
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
     * @param descripcion Descripción del item.
     */
    public void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
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
     * @param cantidad Cantidad del item.
     * @throws IllegalArgumentException si la cantidad es negativa o superior a MAX_CANTIDAD.
     */
    public void setCantidad(final int cantidad) {
        if (cantidad < 0 || cantidad > MAX_CANTIDAD) {
            throw new IllegalArgumentException("La cantidad debe estar entre 0 y " + MAX_CANTIDAD);
        }
        this.cantidad = cantidad;
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
     * @param precio Precio del item.
     * @throws IllegalArgumentException si el precio es menor a MIN_PRECIO.
     */
    public void setPrecio(final float precio) {
        if (precio < MIN_PRECIO) {
            throw new IllegalArgumentException("El precio debe ser mayor a " + MIN_PRECIO);
        }
        this.precio = precio;
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
        cantidad--;
    }

    /**
     * Establece el precio total basado en la cantidad y el precio unitario.
     *
     * @param precio El precio unitario.
     */
    public void setPrecioCantidad(final float precio) {
        this.precioCantidad =  precio;
    }
}
