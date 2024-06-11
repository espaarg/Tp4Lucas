package org.example.entidades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarritoTest {

    Carrito carrito = new Carrito();
    Item item = new Item();

    @Test
    void testAgregarItemCompletoAlCarrito() {
        item.setNombre("Botella de Agua");
        item.setDescripcion("Botella de 1 litro");
        item.setCantidad(2);
        item.setPrecio(20);
        item.setPrecioCantidad(40);
        carrito.aniadirItems(item);
    }

//    @Test
//    void testNoAgregarItemIncompletoAlCarrito() {
//        item.setNombre("Botella de Agua");
//        item.setCantidad(2);
//        item.setPrecio(20);
//        // Falta la descripción y el precioCantidad
//        carrito.aniadirItems(item);
//    }


//    @Test
//    void testAgregarItemCantidadNegativa() {
//        item.setNombre("Botella de Coca");
//        item.setDescripcion("Botella de 1 litro");
//        item.setCantidad(-1);
//        item.setPrecio(20);
//        item.setPrecioCantidad(40);
//        carrito.aniadirItems(item);
//    }
    @Test
    void calcularTotalDelCarrito (){
        carrito.calcularTotal(carrito);
    }

    @Test
    void eliminarItemDelCarrito (){
        carrito.eliminarItems(item);
    }

    @Test
    void InicioCarritoVacio(){
        Carrito carritonuevo = new Carrito();
        assertTrue(carritonuevo.getItems().isEmpty());
    }

}
