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
    }
    @Test
    void setPrecio() {
    }
    @Test
    void setPrecioCantidad() {
    }
    @Test
    void getCantidad() {
    }
    @Test
    void getDescripcion() {
    }
    @Test
    void getNombre() {
        String name = item.getNombre();
        assertEquals(name,"Zapatilla");
    }
    @Test
    void getPrecioCantidad() {
    }
    @Test
    void getPrecio() {
    }
}