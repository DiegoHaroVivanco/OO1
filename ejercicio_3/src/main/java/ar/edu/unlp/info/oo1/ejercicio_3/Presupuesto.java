package ar.edu.unlp.info.oo1.ejercicio_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Presupuesto {
	
	private LocalDate fecha;
	private String cliente;
	private Collection<Item> items;
	
	
	public Presupuesto() {
		this.items = new ArrayList<Item>();
		this.fecha = LocalDate.now();
	}
	
	
	public void agregarItem(Item item) {
		this.items.add(item);
		
	}
	
	
	public double calcularTotal() {
		return this.items.stream().mapToDouble(item -> item.costo()).sum();
	}


	public LocalDate getFecha() {
		return fecha;
	}

	
	 public Presupuesto cliente(String cliente) {
		 this.cliente = cliente;
		 return this;
	 }
	

	public String getCliente() {
		return cliente;
	}
}
