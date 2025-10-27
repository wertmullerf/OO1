package oo1.ejercicio19;

import java.util.LinkedList;
import java.util.List;

public class Propiedad {
	private String nombre, direccion;
	private Double precioPorNoche;
	private List<Reserva> reservas;
	public Propiedad(String nombre, String direccion, Double precioPorNoche) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new LinkedList<Reserva>();
	}
	
	
	
	
}
