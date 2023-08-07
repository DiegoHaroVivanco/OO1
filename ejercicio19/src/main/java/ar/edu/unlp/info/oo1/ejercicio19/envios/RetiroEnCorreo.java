package ar.edu.unlp.info.oo1.ejercicio19.envios;

public class RetiroEnCorreo implements MecanismoDeEnvio{

	@Override
	public double costoDeEnvio(String dirVendedor, String dirCliente) {
		return 50;
	}

}
