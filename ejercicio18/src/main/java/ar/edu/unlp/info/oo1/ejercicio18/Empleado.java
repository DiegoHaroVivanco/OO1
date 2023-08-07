package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Empleado {

	private List<Contrato> contratos;
	private String nombre;
	private String apellido;
	private String cuil;
	private LocalDate fechaNac;
	private boolean tieneConyuge;
	private boolean tieneHijos;
	private LocalDate fechaInicioContrato;
	
	public Empleado(String nombre, String ape, String cuil, LocalDate fechaNac, boolean hijos, boolean conyuge, LocalDate fechaIni) {
		this.nombre = nombre;
		this.apellido = ape;
		this.cuil = cuil;
		this.fechaNac = fechaNac;
		this.tieneHijos = hijos;
		this.tieneConyuge = conyuge;
		this.fechaInicioContrato = fechaIni;
	}
	
	
	public void cargarContrato(LocalDate fechaIni, LocalDate fechaFin, double valorHora, int cantHoras) {
		 Contrato contrato = new ContratoPorHoras(this ,valorHora, cantHoras,fechaIni, fechaFin);
		 this.contratos.add(contrato);
	}
	
	public void cargarContrato(LocalDate fechaIni, double sueldo, double montoConyuge, double montoHijos) {
		Contrato contrato = new ContratoDePlanta(this ,sueldo, montoConyuge, montoHijos, fechaIni);
		this.contratos.add(contrato);
	}
	
	public boolean estaContratoVencido() {
		return this.contratoActual().estaVencido();
	}
	
	public boolean estaContratoActivo() {
		return this.contratoActual().estaActivo();
	}
	
	private Contrato contratoActual() {
		return this.contratos.stream().max((Contrato c1, Contrato c2) -> c1.getFechaInicio().compareTo(c2.getFechaInicio())).orElse(null);
	} 
	
	public int getAntiguedad() {
			return (int) this.fechaInicioContrato.until(LocalDate.now(), ChronoUnit.YEARS);
	}
	
	public ReciboDeSueldo generarReciboDeSueldo() {
		Contrato contratoAct = this.contratoActual();
		if(contratoAct!= null && contratoAct.estaActivo()) {
			return new ReciboDeSueldo(this, this.getAntiguedad(), contratoAct.totalACobrar());
		}
		return null;
	}
	
	public String getCuil() {
		return this.cuil;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDate getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}


	public boolean isTieneConyuge() {
		return tieneConyuge;
	}


	public void setTieneConyuge(boolean tieneConyuge) {
		this.tieneConyuge = tieneConyuge;
	}


	public boolean isTieneHijos() {
		return tieneHijos;
	}


	public void setTieneHijos(boolean tieneHijos) {
		this.tieneHijos = tieneHijos;
	}
	
}
