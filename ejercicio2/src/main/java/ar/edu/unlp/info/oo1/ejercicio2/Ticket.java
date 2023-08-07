package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.*;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	
	
	public Ticket() {
		this.fecha = LocalDate.now();
	}
	
	public double impuesto() {
		return (this.precioTotal * 0.21);
	}

	public LocalDate getFecha() {
		return this.fecha;
	}
	

	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	@Override
	public String toString() {
		return "Fecha: " + this.getFecha()+"\n" + "Cantidad de productos: " + this.getCantidadDeProductos()+"\n" +
				"Peso total: " + (this.getPesoTotal() + this.impuesto())+"\n" + "Precio total: "+this.getPrecioTotal();
	}
	
	
}
