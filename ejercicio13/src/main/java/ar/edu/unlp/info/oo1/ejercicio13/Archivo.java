package ar.edu.unlp.info.oo1.ejercicio13;

public class Archivo {

	private String nombre;
	
	private Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double tamaño() {
		return this.nombre.length();
	}
	
}
