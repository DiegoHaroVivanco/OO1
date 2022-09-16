package ar.edu.unlp.info.oo1.ejercicio_5;

import java.time.LocalDate;

public class Mamifero {

	private Mamifero madre;
	private Mamifero padre;
	private String id;
	private String especie;
	private LocalDate fechaNacimiento;

	
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
		return this.fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}
	
	public Mamifero getPadre() {
		return this.padre;
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
		if(this.madre != null) {
			return this.madre.getPadre();
		}
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if(this.madre != null) {
			return this.madre.getMadre();
		}
		
		return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if(this.padre != null) {
			return this.padre.getPadre();
		}
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if(this.padre != null) {
			return this.padre.getMadre();
		}
		return null;
	}
	
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return (unMamifero != null && this.getMadre() !=null && this.getPadre() != null) && (
				this.getMadre().equals(unMamifero) || this.getPadre().equals(unMamifero) || 
				this.getMadre().tieneComoAncestroA(unMamifero) || this.getPadre().tieneComoAncestroA(unMamifero));
	}

}
