package ar.edu.unlp.info.oo1.ejercicio14;

public class PrismaRectangular extends Pieza{
	private double ladoMayor,ladoMenor,altura;
	public PrismaRectangular(String material, String color, double ladoMayor, double ladoMenor, double altura) {
		super(material,color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
	@Override
	public double calcularVolumen() {
		return ladoMayor * ladoMenor * altura;
	}
	@Override
	public double calcularSuperficie() {
		return  2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
	}
	
	
}
