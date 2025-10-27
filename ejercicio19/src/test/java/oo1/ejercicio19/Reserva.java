package oo1.ejercicio19;

import java.time.LocalDate;

public class Reserva {
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Propiedad propiedad;
	
	public Reserva(LocalDate fechaInicio, LocalDate fechaFin, Propiedad propiedad) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.propiedad = propiedad;
	}
	
	
	public Double getPrecio() {
		DateLapse cantDias = new DateLapse(fechaInicio, fechaFin);
		return propiedad.getPrecioPorNoche() * cantDias;
	}
}
