package ar.edu.unlp.info.oo1.ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversiones{

	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDelInteresDiario;
	
	public PlazoFijo(double montoDepositado, double porcentajeDelInteresDiario) {
		this.fechaDeConstitucion = LocalDate.now();
		this.montoDepositado = montoDepositado;
		this.porcentajeDelInteresDiario = porcentajeDelInteresDiario;
	}
	
	
	public double valorActual() {
		return (this.montoDepositado * (1+(this.porcentajeDelInteresDiario * (ChronoUnit.DAYS.between(fechaDeConstitucion, LocalDate.now())))));
	}


	

}
