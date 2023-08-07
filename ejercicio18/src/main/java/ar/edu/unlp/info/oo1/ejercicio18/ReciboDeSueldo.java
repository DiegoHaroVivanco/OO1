package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public class ReciboDeSueldo {
	
	private LocalDate fecha;
	private int antiguedad;
	private Empleado empleado;
	
	public ReciboDeSueldo(Empleado empleado, int antiguedad, double monto) {
		this.empleado = empleado;
		this.fecha = LocalDate.now();
		this.antiguedad = antiguedad;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
}
