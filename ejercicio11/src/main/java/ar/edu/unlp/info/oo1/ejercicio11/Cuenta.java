package ar.edu.unlp.info.oo1.ejercicio11;


/*
 Se llama así porque la clase abstracta Cuenta define la estructura general 
 (métodos públicos como extraer, transferirACuenta), pero deja un "gancho"
  (puedeExtraer) para que las subclases definan la lógica particular. 
  Esto es un patrón de diseño conocido como Template Method: la superclase marca 
  el flujo y delega un paso clave a las subclases.
 */
public abstract class Cuenta {
    private double saldo;

    public Cuenta() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    protected void extraerSinControlar(double monto) {
        this.saldo -= monto;
    }

    public boolean extraer(double monto) {
        if (this.puedeExtraer(monto)) {
            this.extraerSinControlar(monto);
            return true;
        }
        return false;
    }

    public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
        if (this.puedeExtraer(monto)) {
            this.extraerSinControlar(monto);
            cuentaDestino.depositar(monto);
            return true;
        }
        return false;
    }

    protected abstract boolean puedeExtraer(double monto);
}
