package org.example.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    Item item = new Item();

    @Test
    void anadirUnoCantidad(){
        item.anadirUnoCantidad();
        assertEquals(item.getCantidad(),3);
    }
    @Test
    void disminuirUnoCantidad(){
        item.disminuirUnoCantidad();
        assertEquals(item.getCantidad(), 1);
    }
    @Test
    void setNombre() {
        String newName = "Llanta";
        item.setNombre(newName);
        assertEquals(item.getNombre(),"Llanta");
    }
    @Test
    void setDescripcion() {
        String newDescrip = "De cuero";
        item.setNombre(newDescrip);
        assertEquals(item.getNombre(),"De cuero");
    }
    @Test
    void setCantidad() {
        int cantidad = 5;
        item.setCantidad(cantidad);
        assertEquals(item.getCantidad(),5);
    }
    @Test
    void setPrecio() {
        int precio = 500;
        item.setPrecio(precio);
        assertEquals(item.getPrecio(),500);
    }
    @Test
    void setPrecioCantidad() {
        item.setPrecioCantidad(100 );
        assertEquals(item.getPrecioCantidad(),100);
    }

}