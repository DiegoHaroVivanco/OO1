package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public class ContratoPorHoras extends Contrato{

	private double valorHora;
	private int cantHoras;
	private LocalDate finContrato;
	
	public ContratoPorHoras(Empleado empleado , double valorHora, int cantHoras, LocalDate inicioContrato, LocalDate finContrato) {
		super(inicioContrato, empleado);
		this.valorHora = valorHora;
		this.cantHoras = cantHoras;
		this.finContrato = finContrato;
	}
	

	@Override
	protected double sueldoBasico() {
		return this.valorHora * this.cantHoras;
	}


	public boolean estaVencido() {
		return this.finContrato.isBefore(LocalDate.now());
	}
	
	public boolean estaActivo() {
		return this.finContrato.isAfter(LocalDate.now());
	}
	
}
