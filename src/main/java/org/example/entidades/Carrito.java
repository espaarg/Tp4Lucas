package org.example.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un carrito de compras.
 */
public class Carrito {

    /** Lista de items en el carrito. */
    private final List<Item> items = new ArrayList<>();

    /**
     * Constructor vacío para Carrito.
     */
    public Carrito() {
    }

    /**
     * Constructor para Carrito con items iniciales.
     *
     * @param items Lista de items a añadir al carrito.
     */
    public Carrito(final List<Item> items) {
        this.items.addAll(items);
    }

    /**
     * Obtiene la lista de items en el carrito.
     *
     * @return Lista de items.
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Establece una nueva lista de items.
     *
     * @param nuevaItems Lista de items a establecer.
     */
    public void setItems(final List<Item> nuevaItems) {
        this.items.clear();
        this.items.addAll(nuevaItems);
    }

    /**
     * Añade un item al carrito.
     *
     * @param item El item a añadir.
     */
    public void aniadirItems(final Item item) {
        if (esItemValido(item)) {
            items.add(item);
            System.out.println("Se ha añadido un item al carrito");
        } else {
            System.out.println("El item no es válido y no se ha añadido al carrito");
        }
    }

    /**
     * Verifica si el item es válido para añadir al carrito.
     *
     * @param item El item a verificar.
     * @return {@code true} si el item es válido, {@code false} de lo contrario.
     */
    private boolean esItemValido(final Item item) {
        return item.getNombre() != null &&
                item.getDescripcion() != null &&
                item.getCantidad() > 0 &&
                item.getPrecio() > 0 &&
                item.getPrecioCantidad() > 0;
    }

    /**
     * Elimina un item del carrito.
     *
     * @param item El item a eliminar.
     */
    public void eliminarItems(final Item item) {
        items.remove(item);
        System.out.println("Se ha eliminado un item del carrito");
    }

    /**
     * Elimina todos los items del carrito.
     */
    public void eliminarTodosLosItems() {
        items.clear();
        System.out.println("Se han eliminado todos los items del carrito");
    }

    /**
     * Calcula el total del carrito.
     *
     * @return El total del carrito.
     */
    public float calcularTotal() {
        float total = 0;
        for (Item item : items) {
            total += item.getPrecio() * item.getCantidad();
        }
        System.out.println("El total del carrito es " + total);
        return total;
    }
}
