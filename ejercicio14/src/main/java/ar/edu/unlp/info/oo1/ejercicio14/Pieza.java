package ar.edu.unlp.info.oo1.ejercicio14;

public abstract class Pieza {
	private String material;
	private String color;
	
	public Pieza(String material, String color) {
		this.material = material;
		this.color = color;
	}
	public abstract double calcularVolumen();
	public abstract double calcularSuperficie();
	
	
	public boolean cumploColor(String color) {
		return color.equals(this.color);
	}
	public boolean cumploMaterial(String material) {
		return this.material.equals(material);
	}
}
	