package ar.edu.unlp.info.oo1.politicas;

import java.time.LocalDate;

import ar.edu.unlp.info.oo1.ejercicio16.Reserva;

public interface Politica {
	
	double montoDeReembolsdo(Reserva reserva, LocalDate fCancelacion);
}
