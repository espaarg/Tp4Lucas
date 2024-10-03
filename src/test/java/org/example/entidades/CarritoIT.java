package org.example.entidades;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CarritoIT {

    @Test
    public void aniadirItems(){
        Carrito carrito = new Carrito();
        Item item1 = new Item("Zapatillas","Nike", 2, 3000);
        Item item2 = new Item("Remera","Adidas", 2, 3000);

        carrito.aniadirItems(item1);
        carrito.aniadirItems(item2);

        assertEquals(2,carrito.getItems().size());
    }

    @Test
    public void calcularTotalCarrito(){
        Carrito carrito = new Carrito();
        Item item1 = new Item("Zapatillas","Nike", 2, 3000);
        Item item2 = new Item("Remera","Adidas", 2, 4000);

        carrito.aniadirItems(item1);
        carrito.aniadirItems(item2);

        assertEquals(14000, carrito.calcularTotal(),0.01);
    }


}
