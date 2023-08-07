package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import ar.edu.unlp.info.oo1.politicas.Politica;


public class OOBnB {

	private Set<Propiedad> propiedades;
	private Set<Usuario> usuarios;
	
	public OOBnB() {
		this.propiedades = new HashSet<Propiedad>();
		this.usuarios = new HashSet<Usuario>();
	}
	
	public Propiedad registrarPropiedad(String nom, String desc, double precio, String direc, Politica politica) {
		Propiedad propiedad  = new Propiedad(nom, desc, precio, direc, politica);
		this.propiedades.add(propiedad);
		return propiedad;
	}
	
	public Usuario registrarUsuario(String nom, String dir, String dni) {
		Usuario usuario = new Usuario(nom, dir, dni);
		this.usuarios.add(usuario);
		return usuario;
	}
	
	public Set<Propiedad> buscarPropiedades(DateLapse periodo){
		return this.propiedades.stream().filter(p -> p.estaDisponible(periodo)).
				collect(Collectors.toSet());
	}
	

	public double calcularIngresosDelUsuario(Usuario usuario, LocalDate inicio, LocalDate fin) {
		return this.propiedades.stream().mapToDouble(p -> p.calcularIngresos(usuario, inicio, fin)).sum();
	}
	
	public List<Reserva> obtenerReservasDeUsuario(Usuario usuario){
		return this.propiedades.stream().flatMap(p -> p.buscarReservasUsuario(usuario).stream()).collect(Collectors.toList());
	}
}
