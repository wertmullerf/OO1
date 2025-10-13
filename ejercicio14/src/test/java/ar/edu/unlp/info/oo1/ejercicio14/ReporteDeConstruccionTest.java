package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReporteDeConstruccionTest {
	private ReporteDeConstruccion reporte;
	private Cilindro cilindro;
	private Esfera esfera;
	private PrismaRectangular prismaRectangular;

	@BeforeEach
	void setUp() {
		reporte = new ReporteDeConstruccion();
		cilindro = new Cilindro("Hierro", "Rojo", 10, 20);
		esfera = new Esfera("Hierro", "Azul", 8);
		prismaRectangular = new PrismaRectangular("Metal", "Azul", 10, 5, 30);
		reporte.agregarPieza(cilindro);
		reporte.agregarPieza(esfera);
		reporte.agregarPieza(prismaRectangular);
	}

	@Test
	void testVolumen() {
		assertEquals(6283, Math.round(cilindro.calcularVolumen()), 0.001);
		assertEquals(2145, Math.round(esfera.calcularVolumen()), 0.001);
		assertEquals(1500, prismaRectangular.calcularVolumen(), 0.001);
	}

	@Test
	void testSuperficie() {
		assertEquals(1885, Math.round(cilindro.calcularSuperficie()));
		assertEquals(804, Math.round(esfera.calcularSuperficie()));
		assertEquals(1000, prismaRectangular.calcularSuperficie());
	}

	@Test
	void testVolumenDeMaterial() {
		assertEquals(8428, Math.round(reporte.volumenDeMaterial("Hierro")));
		assertEquals(0, reporte.volumenDeMaterial("Test"));
		assertEquals(0, reporte.volumenDeMaterial(null));
	}

	void testSuperficieDeColor() {
		assertEquals(1804, Math.round(reporte.superficieDeColor("Azul")));
		assertEquals(0, reporte.superficieDeColor("Verde"));
		assertEquals(0, reporte.superficieDeColor(null));
	}

}