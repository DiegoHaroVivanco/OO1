package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.LocalDate;

public class Factura {
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	private Usuario usuario;
	
	public Factura(double montoEnergiaActiva, double descuento, Usuario usuario) {
		this.fecha = LocalDate.now();
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.descuento = descuento;
		this.usuario = usuario;
	}
	
	
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public double getDescuento () {
		return this.descuento;
	}
	
	public double getMontoEnergiaActiva() {
		return this.montoEnergiaActiva;
	}
	
	public double montoTotal() {
		return  this.montoEnergiaActiva - ((this.montoEnergiaActiva * this.descuento) / 100);
	}
}
