package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PruebaTest {

    @Test
    public void testSumaPositivo() {
        Prueba prueba = new Prueba();
        double resultado = prueba.suma(2.5, 3.8);
        double esperado = 6.5;

        // Comprueba si el resultado es igual al valor esperado con un delta de 0.01 para tolerar redondeos
        org.junit.jupiter.api.Assertions.assertEquals(esperado, resultado, 0.01);
    }
}
