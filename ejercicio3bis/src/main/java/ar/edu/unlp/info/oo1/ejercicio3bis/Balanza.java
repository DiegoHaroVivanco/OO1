package ar.edu.unlp.info.oo1.ejercicio3bis;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto> productos;
	
	
	public Balanza () {
		this.productos = new ArrayList<Producto>();
	}
	
	public void ponerEnCero() {
		this.productos.clear(); // elimino todos los elementos de la lista
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public List<Producto> getProdutos(){
		return this.productos;
	}
	
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.getProdutos(), this.getPrecioTotal(), this.getPesoTotal(), this.getCantidadDeProductos());
		this.ponerEnCero();
		return ticket;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}


	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(produ -> produ.getPrecio()).sum();
	}

	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(produ -> produ.getPeso()).sum();	
	}	


}
