package ar.edu.unlp.info.oo1.ejercicio_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Usuario {

	private String domicilio;
	private String nombre;
	private Collection<Consumo> consumos;
	private List<Factura> facturas;
	
	public Usuario(String nombre, String domicilio) {
		this.domicilio = domicilio;
		this.nombre = nombre;
		this.consumos = new ArrayList<>();
		this.facturas = new ArrayList<>();
	}
	
	
	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}
	
	
	public Consumo ultimoConsumo() {
		return this.consumos.stream().max((c1, c2)-> c1.getFecha().compareTo(c2.getFecha())).orElse(null);
	}
	
	public double ultimoConsumoActiva() {
		return this.ultimoConsumo() != null ? this.ultimoConsumo().getConsumoEnergiaActiva() : 0;
	}
	
	
	public Factura facturarEnBaseA(double precioKWh) {
		Consumo ultimoConsumo = this.ultimoConsumo();
		Factura factura;
		if(ultimoConsumo == null) 
			return new Factura(0, 0, this);
		
		if(ultimoConsumo.factorDePotencia() > 0.8) {
			factura =  new Factura(ultimoConsumo.costoEnBaseA(precioKWh), 10, this);
			this.facturas.add(factura);
			return factura;
		}
		
		factura =  new Factura(ultimoConsumo.costoEnBaseA(precioKWh), 0, this);
		this.facturas.add(factura);
		return factura;

	}
	
	
	public List<Factura> facturas(){
		return this.facturas;
	}
	
	
	
	
	


	public String getDomicilio() {
		return domicilio;
	}


	public String getNombre() {
		return nombre;
	}
	
	
	
	
	
	
}
