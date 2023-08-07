package ar.edu.unlp.info.oo1.ejercicio15;

public class Reserva {

	private Propiedad propiedad;
	private DateLapse periodoReservado;
	private Usuario usuario;
	
	public Reserva(Propiedad propiedad, DateLapse periodoReservado, Usuario usuario) {
		this.propiedad = propiedad;
		this.periodoReservado = periodoReservado;
		this.usuario = usuario;
	}
	
	public DateLapse getPeriodoReservado() {
		return this.periodoReservado;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public Propiedad getPropiedad() {
		return this.propiedad;
	}
	
	public double calcularPrecio() {
		return this.propiedad.getPrecioPornoche() * this.periodoReservado.sizeInDays();
	}
	
	public boolean entrePeriodo(DateLapse periodo) {
		return periodo.includesDate(this.periodoReservado.getFrom()) && periodo.includesDate(this.periodoReservado.getTo());
	}

	
	
}
