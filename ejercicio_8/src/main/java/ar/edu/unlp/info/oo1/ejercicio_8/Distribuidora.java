package ar.edu.unlp.info.oo1.ejercicio_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora {
	
	private double precioKWh;
	private Collection<Usuario> usuarios;
	
	
	
	public Distribuidora(double precioKWh) {
		this.precioKWh = precioKWh;
		this.usuarios = new ArrayList<>();
	}
	
	
	public void agregarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	
	public List<Factura> facturar(){
		return this.usuarios.stream().map(u -> u.facturarEnBaseA(this.precioKWh)).
				collect(Collectors.toList());
	}

	public double consumoTotalActiva() {
		return this.usuarios.stream().mapToDouble(u -> u.ultimoConsumoActiva()).sum();
	}
	
	
	public void precioKWh(double precio) {
		this.precioKWh = precio;
	}


	public double getPrecioKWh() {
		return precioKWh;
	}


	public Collection<Usuario> getUsuarios() {
		return usuarios;
	}
	
	
	
	
}
