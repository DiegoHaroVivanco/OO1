package ar.edu.unlp.info.oo1.ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Farola {

	private List<Farola> farolas;
	private boolean encendida;
	
	
	public Farola() {
		this.encendida = false;
		this.farolas = new ArrayList<>();
	}
	
	private void addNeighbor(Farola unaFarola) {
		this.farolas.add(unaFarola);
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		if(!this.farolas.contains(otraFarola)) {
			this.farolas.add(otraFarola);
			otraFarola.addNeighbor(this); 
		}
	}
	
	// ??
	public List<Farola> getNeighbors() {
		List<Farola> otrasFarolas = this.farolas;
		return otrasFarolas;
	}
	
	public void turnOn() {
		if(!this.isOn()) {
			this.encendida = true;
			this.farolas.stream().forEach(f -> f.encendida = true);
		}
	}
	
	public void turnOff() {
		if(this.isOn()) {
			this.encendida = false;
			this.farolas.stream().forEach(f -> f.encendida = false);
		}

	}
	
	public boolean isOn() {
		return this.encendida;
	}
	
	
}
