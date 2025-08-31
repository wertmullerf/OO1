package ar.edu.unlp.info.oo1.ejercicio2;

import java.util.Date;

public class Ticket {
	private Date fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	double impuesto() {
		return precioTotal * 1.21;
	}
}
