package ar.edu.unlp.info.oo1.ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class Balanza {
	private int cantidadDeProductos;
	private double pesoTotal;
	private List<Producto> productos = new LinkedList<Producto>();
	void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		productos.clear();
	}
	
	void agregarProducto(Producto producto) {
		this.pesoTotal += producto.getPeso();
		this.cantidadDeProductos++;
		this.productos.add(producto);
	}
	
	public List<Producto> getProductos(){
		return productos;
	}
	
	Ticket emitirTicket() {
		Ticket ticket = new Ticket(productos);
		return ticket;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		double aux = productos.stream().mapToDouble(producto -> producto.getPrecio()).count();
		return aux;
		
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	
}
