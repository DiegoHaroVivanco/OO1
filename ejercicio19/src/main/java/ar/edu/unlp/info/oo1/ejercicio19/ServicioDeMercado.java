package ar.edu.unlp.info.oo1.ejercicio19;

import java.util.ArrayList;
import java.util.List;

public class ServicioDeMercado {

	private List<Usuario> usuarios;
	
	public ServicioDeMercado() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario registrarVendedor(String nombre, String direccion) {
		Usuario nuevoUsuario = new Usuario(nombre, direccion);
		this.usuarios.add(nuevoUsuario);
		return nuevoUsuario;
	}
	
	public Usuario registrarCliente(String nombre, String direccion) {
		return this.registrarVendedor(nombre, direccion);
	}
	
	public Usuario buscarVendedor(String nombre) {
		return this.usuarios.stream().filter(u -> !u.noTieneVentas() && u.getNombre().equals(nombre)).
				findFirst().orElse(null);
	}
	
	public Usuario buscarCliente(String nombre) {
		return this.usuarios.stream().filter(u -> !u.noTieneCompras() && u.getNombre().equals(nombre)).
				findFirst().orElse(null);
	}
	
}
