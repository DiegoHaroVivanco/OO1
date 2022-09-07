package ar.edu.unlp.info.oo1.ejercicio_3bis;

import java.time.LocalDate;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private Collection<Producto> productos;
	

	public Ticket(int cantidadDeProductos, double pesoTotal, double precioTotal, Collection<Producto> productos2) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantidadDeProductos;
		this.precioTotal = precioTotal;
		this.pesoTotal = pesoTotal;
		this.productos = productos2;
	}
	
	// desde Balanza pasarle al constructor de Ticket la list de los productos
	// asi a parte de conocerlos puede acceder al metodo getProductos() ??
	
	public double impuesto() {
		return (this.precioTotal*0.21);
	}
	
	public List<Producto> getProductos(){
		return this.productos.stream().collect(Collectors.toList());
	}
	
	
	public double getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	
}
