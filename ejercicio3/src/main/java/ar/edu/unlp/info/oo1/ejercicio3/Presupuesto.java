package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private double total;
	
	public Presupuesto(String cliente) {
		this.cliente = cliente;
		this.fecha = LocalDate.now();
		this.total = 0;
	}
	void agregarItem(Item item) {
		this.total += item.costo();
	}
	
	double calcularTotal() {
		return this.total;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public String getCliente() {
		return cliente;
	}
	
	
	
}
