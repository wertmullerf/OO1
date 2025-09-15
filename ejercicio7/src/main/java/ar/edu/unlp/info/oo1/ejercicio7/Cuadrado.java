package ar.edu.unlp.info.oo1.ejercicio7;

public class Cuadrado implements Figura2D {
	private double lado;

	

	public double getArea() {
		return Math.pow(lado, 2); //base, exponente
	}

	@Override
	public double getPerimetro() {
		return lado * 4;
	
	}
	
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	
	
}
