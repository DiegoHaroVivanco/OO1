package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {

	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	public Carpeta() {
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void guardarMail(Email email) {
		this.emails.add(email);
	}
	
	public void eliminarMail(Email email) {
		this.emails.remove(email);
	}
	
	public double tamaño() {
		return this.emails.stream().mapToDouble(e -> e.tamaño()).sum();
	}
	
	public List<Email> emails(){
		return List.copyOf(this.emails);
	}

	public Email buscarEmail(String texto) {
		return this.emails.stream().filter(e -> e.contieneTexto(texto)).findFirst().orElse(null);
		
	}
}
