package org.example.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangoCantidadTest {
    RangoCantidad rangoCantidad1 = new RangoCantidad();

    @Test
    void cantidadMaximaProducto(){
        rangoCantidad1.setCant(12);
        assertEquals(rangoCantidad1.cantidadMaxima(),true);
    }
    @Test
    void cantidadMinimaProducto(){
        rangoCantidad1.setCant(0);
        assertEquals(rangoCantidad1.cantidadMinima(),true);
    }
}
