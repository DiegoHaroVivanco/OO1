package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {

	 private List <Item> items;
	 private LocalDate fecha;
	 private String cliente;
	 
	 public Presupuesto() {
		this.fecha = LocalDate.now();
		this.items = new ArrayList<Item>();
	 }
	 
	 public void agregarItem(Item item) {
		this.items.add(item); 
	 }
	
	 public double calcularTotal() {
		 return this.items.stream().mapToDouble(item -> item.costo()).sum();
	 }
	 
	 public LocalDate getFecha() {
		 return this.fecha;
	 }
	 
	 public Presupuesto cliente(String cliente) {
		 this.cliente = cliente;
		 return this;
	 }
	 
	 public String getCliente() {
		 return this.cliente;
	 }
}
