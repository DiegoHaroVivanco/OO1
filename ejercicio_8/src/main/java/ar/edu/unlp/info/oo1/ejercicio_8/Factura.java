package ar.edu.unlp.info.oo1.ejercicio_8;

import java.time.LocalDate;

public class Factura {

	private Usuario usuario;
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	
	
	public Factura(double montoEnergiaActiva, double descuento, Usuario usuario) {
		this.fecha = LocalDate.now();
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.descuento = descuento;
		this.usuario = usuario;
		
	}


	
	public double montoTotal() {
		return this.montoEnergiaActiva - (this.montoEnergiaActiva * 0.10);
	}
	
	
	
	public Usuario getUsuario() {
		return usuario;
	}


	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}


	public double getDescuento() {
		return descuento;
	}


	public LocalDate getFecha() {
		return fecha;
	}
	
	
	
	
	
	
	
	
	
}
