package ar.edu.unlp.info.oo1.ejercicio11;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro() {
		super();
	}
	@Override
	protected boolean puedeExtraer(double monto) {
		double montoTotal = monto * 1.02;
		return this.getSaldo() >= montoTotal;
	}
	
    @Override
    public void depositar(double monto) {
        // También los depósitos tienen 2% de costo
        double neto = monto * 0.98;
        super.depositar(neto);
    }

    @Override
    protected void extraerSinControlar(double monto) {
        // Aplica el costo del 2% a la extracción real
        double montoTotal = monto * 1.02;
        super.extraerSinControlar(montoTotal);
    }

}
