package ar.edu.unlp.info.oo1.ejercicio19;

public class Producto {

	private String nombre;
	private String descripcion;
	private double precio;
	private int unidadesDisponibles;
	private Usuario vendedor;
	
	public Producto(Usuario vendedor, String nombre, String desc, double precio, int uDisponibles) {
		this.vendedor = vendedor; 
		this.nombre = nombre;
		this.descripcion = desc;
		this.precio = precio;
		this.unidadesDisponibles = uDisponibles;
	}
	
	
	public boolean tieneUnidades(int cantUnidades) {
		return this.unidadesDisponibles >= cantUnidades;
	}
	
	public void setUnidades(int unidadesPedidas) {
		this.unidadesDisponibles = this.unidadesDisponibles - unidadesPedidas;
	}
	
	public String getNombre() {
		return this.nombre;
	}


	public String getDescripcion() {
		return this.descripcion;
	}

	public double getPrecio() {
		return this.precio;
	}

	public Usuario getVendedor() {
		return this.vendedor;
	}

}
