package ar.edu.unlp.info.oo1.ejercicio14;

import java.util.LinkedList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	public ReporteDeConstruccion() {
		this.piezas = new LinkedList<Pieza>();
	}
	
	public double volumenDeMaterial(String material) {
		double aux =0;
		for(Pieza pieza: piezas) {
			if(pieza.cumploMaterial(material)) {
				aux+= pieza.calcularVolumen();
			}
		}
		return aux;
	}
	
	public double superficieDeColor(String color) {
		double aux =0;
		System.out.println(color);
		for(Pieza pieza: piezas) {
			if(pieza.cumploColor(color)) {
				aux+= pieza.calcularSuperficie();
			}
		}
		System.out.println(aux);

		return aux;
	}
	
	public void agregarPieza(Pieza p) {
		this.piezas.add(p);
	}

}
