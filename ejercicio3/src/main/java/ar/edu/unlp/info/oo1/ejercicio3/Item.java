package ar.edu.unlp.info.oo1.ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item() {
		this.detalle = "";
		this.cantidad = 0;
		this.costoUnitario = 0;
	}

	public double costo() {
		return this.cantidad * this.costoUnitario;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public Item detalle(String detalle) {
		this.detalle = detalle;
		return this;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public Item cantidad(int cantidad) {
		this.cantidad = cantidad;
		return this;
	}

	public double getCostoUnitario() {
		return this.costoUnitario;
	}

	public Item costoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
		return this;
	}
	
	
}
