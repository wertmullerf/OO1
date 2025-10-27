package oo1.ejercicio15;

import java.util.LinkedList;
import java.util.List;

public class ClienteDeCorreo {
	private List<Carpeta> carpetas;
	private Carpeta inbox; //-- Bandeja de entrada
	
	
	public ClienteDeCorreo(String nombre) {
		this.inbox = new Carpeta(nombre);
		this.carpetas = new LinkedList<Carpeta>();
		this.carpetas.add(this.inbox);
	}

	public void recibir(Email email) {
		this.inbox.agregarMail(email);
	}
	
	public Email buscar(String texto) {
		return this.carpetas.stream().map(c -> c.buscar(texto)).filter(e -> e.cumple(texto)).findFirst().orElse(null);
	}
	
	
	public Integer espacioOcupado() {
		return carpetas.stream().mapToInt(c -> c.espacioOcupado()).sum();
	}
	public void agregarCarpeta(Carpeta carpeta) {
		carpetas.add(carpeta);
	}
	
	public void mover(Email email, Carpeta destino) {
		destino.agregarMail(email);
	}

}
