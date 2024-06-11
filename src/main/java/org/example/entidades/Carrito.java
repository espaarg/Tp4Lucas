package org.example.entidades;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    public List<Item> items = new ArrayList<>();

    public Carrito() {
    }

    public Carrito(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void aniadirItems(Item i) {
        items.add(i);
        System.out.println("Se ha añadido un item al carrito");
    }

    public void eliminarItems(Item i) {
        items.remove(i);
        System.out.println("Se ha eliminado un item al carrito");
    }

    public float calcularTotal(Carrito c){
      float total = 0;
        for (Item item : c.getItems()){
            total += item.getPrecio() * item.getCantidad();
        }
        System.out.println("El total del carrito es"+total);
        return total;

    }
}
