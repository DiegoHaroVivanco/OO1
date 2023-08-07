package ar.edu.unlp.info.oo1.ejercicio9;

public class CuentaCorriente extends Cuenta{

	private double limite;
	
	public CuentaCorriente(double monto, double limite) {
		super(monto);
		this.limite = limite;
	}
	
	public CuentaCorriente() {
		this.limite = 0;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getLimite(double limite) {
		return this.limite;
	}
	
	@Override
	protected boolean puedeExtraer(double monto) {
		return (monto <= limite + this.getSaldo());
	}
	
	
}
