package ar.edu.unlp.info.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {
	private DateLapse fechas;
	private LocalDate from;
	private LocalDate to;
	
	
	private LocalDate from2;
	private LocalDate to2;
	
	private DateLapse fechas2;
	
	private DateLapse fechas3;
	@BeforeEach
	void setUp() {
		from = LocalDate.of(2025,1,1);
		to = LocalDate.of(2026, 1, 1);
		fechas = new DateLapse(from, to);
		
		from2 =LocalDate.of(2025, 12, 1); 
		to2 = LocalDate.of(2024, 10, 10);
		
		fechas2 =new DateLapse(from2, to2);
		fechas3 = new DateLapse(from, from);
	}
	

	@Test 
	void testSizeInDays(){
		assertEquals(365, fechas.sizeInDays());
		assertEquals(0, fechas2.sizeInDays());
		assertEquals(0, fechas3.sizeInDays());
		/*
		 * 1. Testeo que la cantidad de dias cumpla
		 * 2. Testeo en los casos donde el FROM es superior al TO
		 * 3. Testeo cuando son la misma fecha
		 */
	}
	
	
	@Test
	void testRango() {
		assertTrue(fechas.includesDate(from));
		assertTrue(fechas.includesDate(to));
		assertFalse(fechas.includesDate(to2));
		assertTrue(fechas.includesDate(from2));
		
		/*
		 * 1. Testeo la fecha del caso borde cuando el from = from
		 * 2. Testeo la fecha del caso borde cuando el to = to
		 * 3. Testeo cuando la fecha no incluye un valor en el rango
		 * 4. Testeo cuando la fecha se encuentra el rango  
		 */
		
	}
	
}
