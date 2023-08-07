package ar.edu.unlp.info.oo1.ejercicio19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unlp.info.oo1.ejercicio19.envios.MecanismoDeEnvio;
import ar.edu.unlp.info.oo1.ejercicio19.pagos.FormaDePago;

public class Usuario {

	private String nombre;
	private String direccion;
	private List<Producto> productos;
	private List<Pedido> pedidos;
	
	public Usuario(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<>();
		this.pedidos = new ArrayList<>();
	}

	
	public Producto ponerProductoEnVenta(String nombre, String desc, double precio, int uDisponibles) {
		return new Producto(this, nombre, desc, precio, uDisponibles);
	}
	
	public List<Producto> buscarProducto(String nombreProducto){
		return this.productos.stream().filter(p -> p.getNombre().equals(nombreProducto)).collect(Collectors.toList());
	}
	
	public void crearPedido(Producto producto, int cantSolicitada, FormaDePago fPago, MecanismoDeEnvio envio) {
		if(producto.tieneUnidades(cantSolicitada)) {
			Pedido nuevoPedido = new Pedido(producto, cantSolicitada, fPago, envio);
			this.pedidos.add(nuevoPedido);
			producto.setUnidades(cantSolicitada);
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public boolean noTieneVentas() {
		return this.productos.isEmpty();
	}
	
	public boolean noTieneCompras() {
		return this.pedidos.isEmpty();
	}
	
}
