package ar.edu.unlp.info.oo1.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Inversor {

	private String nombre;
	private List<Inversiones> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversiones>();
	}
	
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(inver -> inver.valorActual()).sum();
	}
	
	public void agregarInversion(Inversiones nuevaInversion) {
		this.inversiones.add(nuevaInversion);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Inversiones> getInversiones(){
		return List.copyOf(this.inversiones);
	}
	

	
}
