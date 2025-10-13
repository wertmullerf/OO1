package ar.edu.unlp.info.oo1.ejercicio11;

public class CuentaCorriente extends Cuenta {
	private double descubierto;
	public CuentaCorriente() {
		super();
		this.descubierto = 0;
	}
	@Override
	protected boolean puedeExtraer(double monto) {
		//total permitido;
		double aux = this.getSaldo() + descubierto; 
		return aux >= monto;
	}
	
	
	public double getDescubierto() {
		return descubierto;
	}
	
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
}
