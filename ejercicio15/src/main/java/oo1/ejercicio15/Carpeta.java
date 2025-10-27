package oo1.ejercicio15;

import java.util.LinkedList;
import java.util.List;

public class Carpeta {
	private List<Email> emails;
	private String nombre;
	public Carpeta(String nombre) {
		this.emails = new LinkedList<>();
		this.nombre = nombre;
	}
	
	
	public void agregarMail(Email email) {
		this.emails.add(email);
	}
	
	public void mover(Email email, Carpeta destino) {
		this.eliminarMail(email);
		destino.agregarMail(email);
	}
	
	public void eliminarMail(Email email) {
		this.emails.remove(email);
	}

	public String getNombre() {
		return nombre;
	}
	
	public Email buscar(String texto) {
		return this.emails.stream().filter(e -> e.cumple(texto)).findFirst().orElse(null);
	}
	
    public Integer espacioOcupado() {
        return emails.stream()
                     .mapToInt(e -> e.espacioOcupado())
                     .sum();
    }
}
