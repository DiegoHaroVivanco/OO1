package ar.edu.unlp.info.oo1.politicas;

import java.time.LocalDate;

import ar.edu.unlp.info.oo1.ejercicio16.Reserva;


public class CancelacionFlexible implements Politica{

	public double montoDeReembolsdo(Reserva reserva, LocalDate fCancelacion) {
		if(fCancelacion.isBefore(reserva.getPeriodoReservado().getFrom())) {
			return reserva.calcularPrecio();
		}
		return 0;
	}

}
