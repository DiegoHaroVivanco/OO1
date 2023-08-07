package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro() {
	}
	
	public CajaDeAhorro(double monto) {
		super(monto);
	}

	@Override
	public void depositar(double monto) {
		super.depositar(monto - (monto * 0.02d));
	}
	
	@Override
	protected boolean puedeExtraer(double monto) {
		return this.getSaldo() > (monto * 1.02d);
	}
	
	@Override
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto * 1.02d);
	}

}
