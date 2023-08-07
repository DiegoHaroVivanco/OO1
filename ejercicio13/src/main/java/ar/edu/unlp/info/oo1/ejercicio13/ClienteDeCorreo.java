package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {

	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.carpetas = new ArrayList<Carpeta>();
		this.inbox = new Carpeta();
		this.carpetas.add(inbox);
	}
	
	public void recibir(Email email) {
		this.inbox.guardarMail(email);
	}
	
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		origen.eliminarMail(email);
		destino.guardarMail(email);		
	}
	
	public Email buscar(String texto) {
		// findAny corta la búsqueda cuando encuentra encuentra un True
		//return this.carpetas.stream().map(c -> c.buscarEmail(texto)).findAny().orElse(null);
		return this.carpetas.stream().map(c -> c.buscarEmail(texto)).filter(e -> e != null).findFirst().orElse(null);	 

	}
	
	public double espacioOcupado() {
		return this.carpetas.stream().mapToDouble(c -> c.tamaño()).sum();
	}
	
	public List<Carpeta> carpetas(){
		return List.copyOf(this.carpetas);
	}

}
