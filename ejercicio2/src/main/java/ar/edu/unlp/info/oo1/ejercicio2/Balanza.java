package ar.edu.unlp.info.oo1.ejercicio2;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	
	public Balanza () {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal += producto.getPrecio();
		this.pesoTotal += producto.getPeso();

	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket();
		ticket.setCantidadDeProductos(this.cantidadDeProductos);
		ticket.setPesoTotal(this.pesoTotal);
		ticket.setPrecioTotal(this.precioTotal);
		this.ponerEnCero();
		return ticket;
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return this.precioTotal;
	}

	public double getPesoTotal() {
		return this.pesoTotal;
	}	
	
	
}
