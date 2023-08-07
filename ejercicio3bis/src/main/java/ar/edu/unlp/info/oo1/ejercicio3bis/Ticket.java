package ar.edu.unlp.info.oo1.ejercicio3bis;

import java.time.*;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> productos;
	
	
	public Ticket(List<Producto> producto, double precioTotal, double pesoTotal, int cantidadDeProductos) {
		this.fecha = LocalDate.now();
		this.productos = producto;
		this.precioTotal = precioTotal;
		this.pesoTotal = pesoTotal;
		this.cantidadDeProductos = cantidadDeProductos;
	}
	
	public double impuesto() {
		return (this.getPrecioTotal() * 0.21);
	}

	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
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

	public double getPrecioTotal() {
		return this.precioTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	@Override
	public String toString() {
		String descripcion = "";
		for(Producto produ : this.productos) {
			
			descripcion += produ.toString()+"\n";
		};
		
		return "Fecha: " + this.getFecha()+"\n" + "Cantidad de productos: " + this.getCantidadDeProductos()+"\n" +
				"Peso total: " + (this.getPesoTotal() + this.impuesto())+"\n" + "Precio total: "+this.getPrecioTotal() + 
				"\n" + "Productos: " + descripcion;
	}
	
	
}
