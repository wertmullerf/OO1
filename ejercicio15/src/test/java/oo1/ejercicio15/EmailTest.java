package oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {
	private Email email,emailVacio;
	private Archivo arc1, arc2;
	@BeforeEach
	void setUp() {
		email = new Email("Test", "Test2");
		emailVacio = new Email("","");
		arc1 = new Archivo("Archivo");
		arc2 = new Archivo("Arch");
		
		email.agregarAdjunto(arc1);
		email.agregarAdjunto(arc2);
	}
	
	
	@Test
	void espacioOcupado() {
		assertEquals(20, email.espacioOcupado());
		assertEquals(0, emailVacio.espacioOcupado());

	}
	@Test
	void testCumple() {
		assertTrue(email.cumple("2"));
		assertTrue(emailVacio.cumple(""));
		assertFalse(email.cumple(null));
		assertFalse(email.cumple("Hola!"));
	}

}
