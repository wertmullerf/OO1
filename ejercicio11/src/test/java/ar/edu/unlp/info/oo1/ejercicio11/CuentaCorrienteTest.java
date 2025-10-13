package ar.edu.unlp.info.oo1.ejercicio11;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	@Test
	public void testDeposito() {
		CuentaCorriente cc = new CuentaCorriente();
		cc.depositar(100);
		assertEquals(100, cc.getSaldo(), 0);
		
	}
	
	
	@Test
	public void testDescubierto() {
		CuentaCorriente cc = new CuentaCorriente();
		cc.setDescubierto(2000);
		assertEquals(2000, cc.getDescubierto(), 0);
	}
	public void testExtraerExcedeDescubierto() {
	    CuentaCorriente cc = new CuentaCorriente();
	    cc.setDescubierto(2000);
	    boolean puede = cc.extraer(2001); // saldo inicial 0 → intentaría -2001
	    assertFalse(puede);
	    assertEquals(0, cc.getSaldo(), 0.01);
	}
	public void testExtraerAlLimiteDescubierto() {
	    CuentaCorriente cc = new CuentaCorriente();
	    cc.setDescubierto(2000);
	    cc.depositar(1000);
	    boolean puede = cc.extraer(3000); // queda en -2000
	    assertTrue(puede);
	    assertEquals(-2000, cc.getSaldo(), 0.01);
	}
	
	@Test
	public void testTransferenciaValida() {
	    CuentaCorriente origen = new CuentaCorriente();
	    CuentaCorriente destino = new CuentaCorriente();
	    origen.setDescubierto(500);
	    origen.depositar(1000);
	    
	    boolean ok = origen.transferirACuenta(800, destino);
	    
	    assertTrue(ok);
	    assertEquals(200, origen.getSaldo(), 0.01);
	    assertEquals(800, destino.getSaldo(), 0.01);
	}
	
	
	@Test
	public void testTransferenciaExcedeDescubierto() {
	    CuentaCorriente origen = new CuentaCorriente();
	    CuentaCorriente destino = new CuentaCorriente();
	    origen.setDescubierto(500);
	    
	    boolean ok = origen.transferirACuenta(600, destino); // saldo 0, descubierto 500
	    assertFalse(ok);
	    assertEquals(0, origen.getSaldo(), 0.01);
	    assertEquals(0, destino.getSaldo(), 0.01);
	}


}
