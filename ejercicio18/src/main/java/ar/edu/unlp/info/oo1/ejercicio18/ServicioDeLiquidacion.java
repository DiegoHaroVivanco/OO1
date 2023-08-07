package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServicioDeLiquidacion {

	private List<Empleado> empleados;
	
	public ServicioDeLiquidacion() {
		this.empleados = new ArrayList<>();
	}
	
	
	public void darDeAltaEmpleado(String nom, String ape, String cuil, LocalDate fNac, boolean hijos, boolean conyuge) {
		Empleado empleado = new Empleado(nom, ape, cuil, fNac, hijos, conyuge, LocalDate.now());
		this.empleados.add(empleado);
	}
	
	public Empleado buscarEmpleado(String cuil) {
		return this.empleados.stream().filter(e -> e.getCuil().equals(cuil)).findAny().orElse(null);
	}
	
	public void darDeBajaEmpleado(Empleado empleado) {
		if(this.empleados.contains(empleado))
			this.empleados.remove(empleado);
	}
	
	public List<Empleado> empleadosConContratosVencidos(){
		return this.empleados.stream().filter(e -> e.estaContratoVencido()).collect(Collectors.toList());
	}
	
	public List<ReciboDeSueldo> recibosDeSueldo(){
		return this.empleados.stream().filter(e -> e.estaContratoActivo()).
				map(e -> e.generarReciboDeSueldo()).collect(Collectors.toList());
	}
}
