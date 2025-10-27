package oo1.ejercicio15;

public class Archivo {
	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre = nombre;

	}
	
	
	public Integer getTamanio() {
		return nombre.length();
	}
	
	public String getNombre() {
		return nombre;
	}
}
