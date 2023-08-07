package ar.edu.unlp.info.oo1.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String domicilio;
	private String nombre;
	private List<Factura> facturas;
	private List<Consumo> consumos;
	
	public Usuario(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.facturas = new ArrayList<Factura>();
		this.consumos = new ArrayList<Consumo>();		
	}
	
	
	public String getDomicilio() {
		return this.domicilio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}
	
	public double ultimoConsumoActiva() {
		return this.ultimoConsumo().getConsumoEnergiaActiva();
	}
	
	public Consumo ultimoConsumo() {
		// no debería comparar c2 > a c1 ???
		return this.consumos.stream().max((c1, c2) -> c1.getFecha().compareTo(c2.getFecha())).orElse(null);
	}
	
	public Factura facturarEnBaseA(double precioKWh) {
		Consumo ultimoConsumo = this.ultimoConsumo();
		if(ultimoConsumo == null) {
			return new Factura(0, 0, this);
		}

		if(ultimoConsumo.factorPotencia() > 0.8d) {
			Factura nuevaFactura = new Factura(ultimoConsumo.costoEnBaseA(precioKWh), 10, this);
			this.facturas.add(nuevaFactura);
			return nuevaFactura;
		}
		Factura nuevaFactura = new Factura(ultimoConsumo.costoEnBaseA(precioKWh), 0d, this);
		this.facturas.add(nuevaFactura);
		return nuevaFactura;

	}
	
	public List<Factura> facturas(){
		return this.facturas;
	}
	
}
