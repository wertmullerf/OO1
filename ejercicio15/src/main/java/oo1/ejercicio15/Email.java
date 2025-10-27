package oo1.ejercicio15;

import java.util.LinkedList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.adjuntos = new LinkedList<Archivo>();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public List<Archivo> getAdjuntos(){
		return adjuntos;
	}
	
    public Integer espacioOcupado() {
    	Integer base = titulo.length() + cuerpo.length();
    	Integer adjuntosSize = adjuntos.stream()
                                   .mapToInt(a -> a.getTamanio())
                                   .sum();
        return (base + adjuntosSize);
    }

    public void agregarAdjunto(Archivo arch) {
    	adjuntos.add(arch);
    }
	
	public boolean cumple(String texto) {
	    if (texto == null || texto.length() == 0) return false;
	    return titulo.contains(texto) || cuerpo.contains(texto);
	}

	
	
}
