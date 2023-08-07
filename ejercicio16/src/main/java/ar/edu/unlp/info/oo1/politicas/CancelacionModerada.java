package ar.edu.unlp.info.oo1.politicas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import ar.edu.unlp.info.oo1.ejercicio16.Reserva;

public class CancelacionModerada implements Politica{
	
	public double montoDeReembolsdo(Reserva reserva, LocalDate fCancelacion) {
		if(fCancelacion.compareTo(reserva.getPeriodoReservado().getFrom()) < 0) {
			int diasDiferencia = (int)ChronoUnit.DAYS.between(fCancelacion, reserva.getPeriodoReservado().getFrom());
			
			if( diasDiferencia <= 7) {
				return reserva.calcularPrecio();
				
			}else if((diasDiferencia > 0) && (diasDiferencia <= 2)) {
				return (reserva.calcularPrecio() / 100) * 50;
			}
		}
		return 0;
	}

}
