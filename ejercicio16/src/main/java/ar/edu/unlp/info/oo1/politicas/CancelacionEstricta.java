package ar.edu.unlp.info.oo1.politicas;

import java.time.LocalDate;
import ar.edu.unlp.info.oo1.ejercicio16.Reserva;

public class CancelacionEstricta implements Politica{

	public double montoDeReembolsdo(Reserva reserva, LocalDate fCancelacion) {
		return 0;
	}
	
}
