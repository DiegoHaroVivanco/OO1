package ar.edu.unlp.info.oo1.ejercicio19.envios;

import ar.edu.unlp.info.oo1.ejercicio19.mapa.Mapa;

public class ExpressADomicilio implements MecanismoDeEnvio{
	
	private Mapa mapa;
	
	/*
	public ExpressADomicilio(Mapa mapa, String dirVendedor, String dirCliente) {
		this.mapa = mapa;
		this.dirVendedor = dirVendedor;
		this.dirCliente = dirCliente;
	} */
	
	@Override
	public double costoDeEnvio(String dirVendedor, String dirCliente) {
		return 0.5 * this.mapa.distanciaEntre(dirVendedor, dirCliente);
	}

}
