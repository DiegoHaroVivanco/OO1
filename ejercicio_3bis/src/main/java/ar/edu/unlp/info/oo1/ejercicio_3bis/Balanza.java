package ar.edu.unlp.info.oo1.ejercicio_3bis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Balanza {

	
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private Collection<Producto> productos = new ArrayList<Producto>();
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0; 
		this.pesoTotal = 0;
		this.productos.clear();
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal += producto.getPrecio();
		this.pesoTotal += producto.getPeso();
		this.productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.cantidadDeProductos, this.pesoTotal, this.precioTotal, this.productos);
	}
	

	public List<Producto> getProductos(){

		return this.productos.stream().collect(Collectors.toList());
		
	}
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}
}
