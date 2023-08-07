package ar.edu.unlp.info.oo1.ejercicio3bis;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	
	public double getPeso() {
		return this.peso;
	}
	
	public double getPrecio() {
		return this.peso * this.precioPorKilo;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}
	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "Descripción: " + this.getDescripcion() + " Peso: " + this.getPeso() +
				" Precio por kilo: " + this.getPrecioPorKilo();
	}


}
