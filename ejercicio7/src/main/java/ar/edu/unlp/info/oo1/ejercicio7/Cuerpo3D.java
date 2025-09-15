package ar.edu.unlp.info.oo1.ejercicio7;

public class Cuerpo3D {
	private Figura2D caraBasal;
	private double altura;
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;	
	}
	
	public void setCaraBasal(Figura2D caraBasal) {
		this.caraBasal =caraBasal;
	}
	
	public double getVolumen() {
		return caraBasal.getArea() * altura;
	}
	
	public double getSuperficieExterior() {
		return ((2 * caraBasal.getArea()) + (caraBasal.getPerimetro() * altura));
	}
}
