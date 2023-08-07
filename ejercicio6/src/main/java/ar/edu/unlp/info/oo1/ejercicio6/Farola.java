package ar.edu.unlp.info.oo1.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	
	private List<Farola> farolas;
	private boolean interruptor;

	public Farola() {
		this.interruptor = false;
		this.farolas = new ArrayList<Farola>();
	}

	private void addNeighbor(Farola unaFarola) {
		this.farolas.add(unaFarola);
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		if (!this.farolas.contains(otraFarola)){ 
			this.farolas.add(otraFarola);		
			otraFarola.addNeighbor(this); // está bien porque otraFarola es del mismo tipo
		}
	}
	
	public List<Farola> getNeighbors() {
		//retornar una copia o retornar collections unmodifiablelist o cambiar la implementacion a un SET
		// para no romper el encapsulamiento retorno una copia, si se quiere alterar la lista no modifica a la original(salvo que se modifiquer a un elemento)
		List<Farola> farolasAux = this.farolas; 
		return farolasAux;
	}
	
	private void setInterruptor(boolean estado) {
		this.interruptor = estado;
	}
	
	public void turnOn() {
		if(!this.isOn()) {
			this.interruptor = true;
			farolas.stream().forEach(farola -> farola.setInterruptor(true));
		}
	}
	
	public void turnOff() {
		if(this.isOn()) {
			this.interruptor = false;
			farolas.stream().forEach(farola -> farola.setInterruptor(false));
		}
	}
	
	public boolean isOn() {
		return (this.interruptor);
	}

}
