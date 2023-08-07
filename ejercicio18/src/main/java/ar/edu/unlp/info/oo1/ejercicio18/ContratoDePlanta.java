package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public class ContratoDePlanta extends Contrato{
	
	private double sueldoMensual;
	private double montoPorConyuge;
	private double montoPorHijos;
	
	public ContratoDePlanta(Empleado empleado, double sueldoMensual, double montoPorConyuge, double montoPorHijos, LocalDate fechaIni) {
		super(fechaIni, empleado);
		this.sueldoMensual = sueldoMensual;
		this.montoPorConyuge = montoPorConyuge;
		this.montoPorHijos = montoPorHijos;
	}
	
	
	@Override
	protected double sueldoBasico() {
		return this.sueldoMensual + this.montoPorConyuge + this.montoPorHijos;
	}

	@Override
	public boolean estaActivo() {
		return true;
	}

	@Override
	public boolean estaVencido() {
		return false;
	}
	
	
}
