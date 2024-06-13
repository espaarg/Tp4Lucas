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
        if (esItemValido(i)) {
            items.add(i);
            System.out.println("Se ha añadido un item al carrito");
        } else  {System.out.println("El item no es válido y no se ha añadido al carrito");}
        }

    private boolean esItemValido(Item i) {
        if (
            i.getNombre() != null &&
            i.getDescripcion() != null &&
            i.getCantidad() > 0 &&
            i.getPrecio()>0 &&
            i.getPrecioCantidad()>0
        ){return true;}
        else { return false;}
    }

    public void eliminarItems(Item i) {
        items.remove(i);
        System.out.println("Se ha eliminado un item al carrito");
    }

    public void eliminarTodosLosItems() {
        items.clear();
        System.out.println("Se han eliminado todos los items del carrito");
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
