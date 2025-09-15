package ar.edu.unlp.info.oo1.ejercicio7;

public class Circulo implements Figura2D {
	private double radio;
	

	public double getDiametro() {
		return radio * 2;
	}
	
	public void setDiametro(double value) {
		this.radio = value /2;
	}
	
	public double getRadio(){
		return radio;
	}
	
	public void setRadio(double value) {
		this.radio = value;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return Math.PI * (radio * 2);
	}
	
}
