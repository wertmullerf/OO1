package oo1.ejercicio19;

import java.sql.Date;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private String nombre, direccion, DNI;
	private List<Propiedad> propiedades;
	private List<Reserva> reservas;
	public Usuario(String nombre, String direccion, String DNI) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.DNI = DNI;
		this.propiedades = new LinkedList<>();
		this.reservas = new LinkedList<>();
	}
	
	public void crearReserva(Dat inicio, LocalDate fin, Propiedad p) {
		if(p.estaDisponible(inicio,fin)) {
			Reserva r = new Reserva(inicio, fin, p);
			reservas.add(r);
			p.agregarReserva(r);
		}
	}
	
	public Double calcularRentabilidad(LocalDate inicio, LocalDate fin) {
		double acc=0;
		for(Propiedad p: propiedades) {
			acc+= p.calcularRentabilidad(inicio, fin);
		}
		return acc;
	}
}
