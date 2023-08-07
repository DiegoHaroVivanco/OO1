package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {

	private List<Archivo> adjuntos;
	private String titulo;
	private String cuerpo;
	
	public Email(String titulo, String cuerpo, Archivo adjunto) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
		this.adjuntos.add(adjunto);
	}
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public void agregarAdjunto(Archivo archivo) {
		this.adjuntos.add(archivo);
	}
	
	public List<Archivo> adjuntos(){
		return List.copyOf(adjuntos);
	}
	
	public boolean contieneTexto(String texto) {
		return this.getTitulo().contains(texto) || this.getCuerpo().contains(texto);
	}
	
	public double tamaño() {
		return (this.titulo.length() + this.cuerpo.length()) + 
				this.adjuntos.stream().mapToDouble(a -> a.tamaño()).sum(); 
	}
	
}
