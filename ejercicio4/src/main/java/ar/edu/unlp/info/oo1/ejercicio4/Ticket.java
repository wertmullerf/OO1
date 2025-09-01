package ar.edu.unlp.info.oo1.ejercicio4;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


public class Ticket {
	private LocalDate fecha;
	private List<Producto> productos;
	
	public Ticket(List<Producto> productos) {
		this.fecha =  LocalDate.now();
		this.productos = new LinkedList<Producto>(productos);
	}
	double impuesto() {
		return productos.stream().mapToDouble(producto -> producto.getPrecio()).count() * 0.21;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public int getCantidadDeProductos() {
		return productos.size();
	}

	public double getPesoTotal() {
		return productos.stream().mapToDouble(producto -> producto.getPeso()).count();
	}

	public double getPrecioTotal() {
		return productos.stream().mapToDouble(producto -> producto.getPrecio()).count();
	}
	
	
	
}
