package ar.edu.unlp.info.oo1.ejercicio2;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal= 0;
		this.pesoTotal = 0;
	}
	
	void agregarProducto(Producto producto) {
		this.pesoTotal += producto.getPeso();
		this.precioTotal += producto.getPrecio();
		this.cantidadDeProductos++;
	}
	
	Ticket emitirTicket() {
		Ticket ticket = new Ticket(cantidadDeProductos, pesoTotal, precioTotal);
		return ticket;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	
}
