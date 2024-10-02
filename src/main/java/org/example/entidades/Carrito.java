package org.example.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un carrito de compras.
 */
public class Carrito {

    /**
     * Lista de Items.
     */
    private final List<Item> items = new ArrayList<>();
    // Lista de items en el carrito.

    /**
     * Constructor vacío para Carrito.
     */
    public Carrito() {
    }

    /**
     * Constructor para Carrito con items iniciales.
     * @param newItems Lista de items a añadir al carrito.
     */
    public Carrito(final List<Item> newItems) {
        this.items.addAll(newItems);
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
     * @param newItems Lista de items a establecer.
     */
    public void setItems(final List<Item> newItems) {
        this.items.clear();
        this.items.addAll(newItems);
    }

    /**
     * Añade un item al carrito.
     *
     * @param i El item a añadir.
     */
    public void aniadirItems(final Item i) {
        if (esItemValido(i)) {
            items.add(i);
            System.out.println("Se ha añadido un item al carrito");
        } else {
            System.out.println("El item no es válido y no se ha "
                    + "añadido al carrito");
        }
    }

    /**
     * Verifica si el item es válido para añadir al carrito.
     *
     * @param i El item a verificar.
     * @return {@code true} si el item es válido, {@code false} de lo contrario.
     */
    private boolean esItemValido(final Item i) {
        return i.getNombre() != null
                && i.getDescripcion() != null
                && i.getCantidad() > 0
                && i.getPrecio() > 0
                && i.getPrecioCantidad() > 0;
    }

    /**
     * Elimina un item del carrito.
     *
     * @param i El item a eliminar.
     */
    public void eliminarItems(final Item i) {
        items.remove(i);
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
