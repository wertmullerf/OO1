package oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
	private Carpeta carpeta, carpetaAuxiliar;
	private Email email1, email2;

	@BeforeEach
	void setUp() {
		carpeta = new Carpeta("Recibidos");
		carpetaAuxiliar = new Carpeta("BackUp");
		email1 = new Email("Objetos1", "Ayuda");
		email2 = new Email("Objetos2", "Proximamente");
		email1.agregarAdjunto(new Archivo("test"));
		carpeta.agregarMail(email1);
		carpeta.agregarMail(email2);
	}
	
	@Test
	void testTamanioCarpeta() {
		assertEquals(37, carpeta.espacioOcupado());
		carpeta.eliminarMail(email1);
		carpeta.eliminarMail(email2);
		assertEquals(0, carpeta.espacioOcupado());
	}
	
	@Test
	void testBuscar() {
		assertNotNull(carpeta.buscar("Objet"));
		assertNull(carpeta.buscar(""));
		assertNull(carpeta.buscar("AA"));
		assertNull(carpeta.buscar(null));
	}

	@Test
	void testMover() {
		carpeta.mover(email1, carpetaAuxiliar);
		assertNotNull(carpetaAuxiliar.buscar("Objetos1"));
		assertNull(carpeta.buscar("Objetos1"));
	}

}
