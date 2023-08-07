package ar.edu.unlp.info.oo1.ejercicio8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Distribuidora {

	private double precioKWh;
	private Set<Usuario> usuarios;
	
	public Distribuidora(double precioKWh) {
		this.precioKWh = precioKWh;
		this.usuarios = new HashSet<Usuario>();
	}
	
	public Set<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public double getPrecioKW() {
		return this.precioKWh;
	}
	
	public void agregarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public List<Factura> facturar() {
		 return this.usuarios.stream().map(usuario -> usuario.facturarEnBaseA(this.precioKWh))
				.collect(Collectors.toList());
	}
	
	public double consumoTotalActiva() {
		return this.usuarios.stream().mapToDouble(usuario -> usuario.ultimoConsumo().getConsumoEnergiaActiva()).sum();
	}
	
}
