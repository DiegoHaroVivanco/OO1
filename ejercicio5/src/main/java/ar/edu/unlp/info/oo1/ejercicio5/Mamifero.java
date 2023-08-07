package ar.edu.unlp.info.oo1.ejercicio5;

import java.time.LocalDate;

public class Mamifero {

	private String id;
	private String especie;
	private LocalDate fecha;
	private Mamifero madre;
	private Mamifero padre;
	
	public Mamifero() {
		this.id = "";
	}
	
	public Mamifero(String id) {
		this.id = id;
	}
	
	public String getIdentificador() {
		return this.id;
	}
	
	public void setIdentificador(String id) {
		this.id = id;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return this.fecha;
	}

	public void setFechaNacimiento(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Mamifero getPadre() {
		return padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return this.madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		return (this.madre != null) ? this.madre.getPadre() : null;
	}
	
	public Mamifero getAbuelaMaterna() {
		return (this.madre != null) ? this.madre.getMadre() : null;
	}
	
	public Mamifero getAbueloPaterno() {
		return (this.padre != null) ? this.padre.getPadre() : null;
	}
	
	public Mamifero getAbuelaPaterna() {
		return (this.padre != null) ? this.padre.getMadre() : null;
	}
	
	private boolean tieneComoAncestro(Mamifero unMamifero) {
		return (this.getMadre() != null && this.getPadre() != null && unMamifero != null) && 
				((this.getMadre().equals(unMamifero) || this.getMadre().tieneComoAncestroA(unMamifero)) || 
				(this.getPadre().equals(unMamifero) || this.getPadre().tieneComoAncestroA(unMamifero)));
	}

	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return this.tieneComoAncestro(unMamifero);
	}

	
	/* Misma solución pero con 2 métodos auxiliares para verificar si es ancestro de la madre o del padre
	private boolean tieneComoAncestroMaterno(Mamifero unMamifero) {
		return (this.getMadre() != null && unMamifero != null) &&
				(this.getMadre().equals(unMamifero) || this.getMadre().tieneComoAncestroA(unMamifero));
	}
	private boolean tieneComoAncestroPaterno(Mamifero unMamifero) {
		return (this.getPadre() != null && unMamifero != null) &&
				(this.getPadre().equals(unMamifero) || this.getPadre().tieneComoAncestroA(unMamifero));
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return this.tieneComoAncestroMaterno(unMamifero) || this.tieneComoAncestroPaterno(unMamifero);
	} */

}