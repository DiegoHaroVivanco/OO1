package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	List<Pieza> piezas;
	
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}
	
	/* si quisiera modularizarlo
	private List<Pieza> listaDeMaterial(String material){
		return this.piezas.stream().
				filter(p -> p.getMaterial().equals(material)).collect(Collectors.toList());
	}
	*/
	
	public double volumenDeMaterial(String material) {
		
		return this.piezas.stream().
				filter(p -> p.getMaterial().equals(material)).mapToDouble(p -> p.volumen()).sum();
	}
	
	
	public double superficieDeColor(String color) {
		return this.piezas.stream().
				filter(p -> p.getColor().equals(color)).mapToDouble(p -> p.superficie()).sum();
	}
	
}
