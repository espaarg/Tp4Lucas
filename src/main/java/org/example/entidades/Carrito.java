package org.example.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un carrito de compras que contiene una lista de items.
 */
public class Carrito {

    /**
     * Lista de items en el carrito.
     */
    private List<Item> items = new ArrayList<>();

    /**
     * Constructor vacío que inicializa el carrito sin items.
     */
    public Carrito() {
        // Constructor vacío
    }

    /**
     * Constructor que inicializa el carrito con una lista de items.
     *
     * @param items Lista de items iniciales para el carrito.
     */
    public Carrito(List<Item> items) {
        this.items = items;
    }

    /**
     * Obtiene la lista de items del carrito.
     *
     * @return Lista de items en el carrito.
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Establece una nueva lista de items en el carrito.
     *
     * @param items Lista de items a establecer.
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * Añade un item al carrito si es válido.
     *
     * @param i El item a añadir.
     */
    public void aniadirItems(Item i) {
        if (esItemValido(i)) {
            items.add(i);
            System.out.println("Se ha añadido un item al carrito");
        } else {
            System.out.println("El item no es válido y no se ha añadido al carrito");
        }
    }

    /**
     * Verifica si un item es válido para ser añadido al carrito.
     *
     * @param i El item a validar.
     * @return true si el item es válido, false en caso contrario.
     */
    private boolean esItemValido(Item i) {
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
    public void eliminarItems(Item i) {
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
     * Calcula el total del carrito sumando el precio de cada item por su cantidad.
     *
     * @param c El carrito cuyas compras se quieren calcular.
     * @return El total calculado del carrito.
     */
    public float calcularTotal(Carrito c) {
        float total = 0;
        for (Item item : c.getItems()) {
            total += item.getPrecio() * item.getCantidad();
        }
        System.out.println("El total del carrito es " + total);
        return total;
    }
}
