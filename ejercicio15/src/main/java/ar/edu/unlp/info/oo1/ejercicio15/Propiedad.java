package ar.edu.unlp.info.oo1.ejercicio15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Propiedad {

	private String nombre;
	private String descripcion;
	private double precioPorNoche;
	private String direccion;
	private List<Reserva> reservas;
	private Usuario usuario;
	
	public Propiedad(String nombre, String descripcion, double precioPorNoche, String direccion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioPorNoche = precioPorNoche;
		this.direccion = direccion;
		this.reservas = new ArrayList<Reserva>();
	}
	
	public double getPrecioPornoche() {
		return this.precioPorNoche;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public boolean estaDisponible(DateLapse periodo) {
		return this.reservas.stream().noneMatch(r -> r.getPeriodoReservado().overlaps(periodo));
	}
	
	public Reserva realizarReserva(DateLapse periodo, Usuario usuario) {
		if(this.estaDisponible(periodo)) {
			Reserva reserva = new Reserva(this, periodo, usuario);
			this.reservas.add(reserva);
			return reserva;
		}
		return null;
	}
	
	public void eliminarReserva(Reserva reserva) {
		if(reserva.getPeriodoReservado().getFrom().isAfter(LocalDate.now())) {
			this.reservas.removeIf(r -> r.equals(reserva));
			System.out.println("Se eliminó la reserva");

			/*
			for (Reserva res : this.reservas) {
				if(res.equals(reserva)) {
					this.reservas.remove(res);
				}
				System.out.println("Se elimino la reserva");
			} */
		}
		System.out.println("La reserva no se eliminó");
	}
	
	public double calcularIngresos(Usuario propietario, LocalDate inicio, LocalDate fin) {
		DateLapse periodo = new DateLapse(inicio, fin);
		if(this.usuario.equals(propietario)) {
			return this.reservas.stream().filter(r -> r.entrePeriodo(periodo)).
					mapToDouble(r -> r.calcularPrecio()).sum();
		}
		return 0;
	} 
	
	public List<Reserva> buscarReservasUsuario(Usuario usuario){
		return this.reservas.stream().filter(r -> r.getUsuario().equals(usuario)).collect(Collectors.toList());
	}

	public double calcularPrecio(Reserva reserva) {
		return this.precioPorNoche * reserva.getPeriodoReservado().sizeInDays();
	}
	
	
}
