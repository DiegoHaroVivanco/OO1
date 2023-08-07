package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public abstract class Contrato {
	protected LocalDate inicioContrato;
	protected Empleado empleado;
	
	public Contrato(LocalDate inicioContrato, Empleado empleado) {
		this.inicioContrato = inicioContrato;
		this.empleado = empleado;

	}
	
	public LocalDate getFechaInicio() {
		return this.inicioContrato;
	}
	
	public double totalACobrar() {
		return this.sueldoBasico() + (this.sueldoBasico() * this.montoPorAntiguedad());
	}
	
	protected double montoPorAntiguedad() {
		if(this.empleado.getAntiguedad() >= 5 && this.empleado.getAntiguedad() < 10) {
			return 0.30;
		}else if(this.empleado.getAntiguedad() >= 10 && this.empleado.getAntiguedad() < 15){
			return 0.50;
		}else if(this.empleado.getAntiguedad() >= 15 && this.empleado.getAntiguedad() < 20) {
			return 0.70;
		}else if(this.empleado.getAntiguedad() == 20){
			return 1.0;
		}
		return 0;
	}

	
	protected abstract double sueldoBasico();
	public abstract boolean estaActivo();
	public abstract boolean estaVencido();

}
