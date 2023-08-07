package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.LocalDate;

public class Consumo {

	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	
	public Consumo(LocalDate fecha, double consumoEnergiaActiva, double consumoEnergiaReactiva) {
		this.fecha = fecha;
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
	public double getConsumoEnergiaActiva() {
		return this.consumoEnergiaActiva;
	}
	
	public double getConsumoEnergiaReactiva() {
		return this.consumoEnergiaReactiva;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public double costoEnBaseA(double precioKWh) {
		return this.consumoEnergiaActiva * precioKWh;
	}
	
	public double factorPotencia() {
		return this.consumoEnergiaActiva / (Math.sqrt(Math.pow(this.consumoEnergiaActiva, 2)) + Math.pow(this.consumoEnergiaReactiva, 2));
	}
	
}
