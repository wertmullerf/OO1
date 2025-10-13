package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {

    @Test
    public void testDepositoConCosto() {
        CajaDeAhorro ca = new CajaDeAhorro();
        ca.depositar(100);
        // Se descuenta 2%
        assertEquals(98, ca.getSaldo(), 0.01);
    }

    @Test
    public void testExtraccionConFondos() {
        CajaDeAhorro ca = new CajaDeAhorro();
        ca.depositar(200);
        boolean exito = ca.extraer(100); // debería costar 102
        assertTrue(exito);
        assertEquals(96, ca.getSaldo(), 0.01);
    }

    @Test
    public void testExtraccionSinFondos() {
        CajaDeAhorro ca = new CajaDeAhorro();
        boolean exito = ca.extraer(50);
        assertFalse(exito);
        assertEquals(0, ca.getSaldo(), 0.01);
    }
}
