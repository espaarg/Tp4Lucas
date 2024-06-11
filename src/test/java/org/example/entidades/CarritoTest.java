package org.example.entidades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarritoTest {

    Carrito carrito = new Carrito();
    Item item = new Item();

    @Test
    void agregarItemAlCarrito (){
        item.setNombre("Botella de Agua");
        item.setCantidad(2);
        item.setPrecio(20);
        carrito.aniadirItems(item);

    }


    @Test
    void calcularTotalDelCarrito (){
        carrito.calcularTotal(carrito);
    }

    @Test
    void eliminarItemDelCarrito (){
        carrito.eliminarItems(item);
    }

}
