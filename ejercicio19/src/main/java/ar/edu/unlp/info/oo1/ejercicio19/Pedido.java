package ar.edu.unlp.info.oo1.ejercicio19;

import ar.edu.unlp.info.oo1.ejercicio19.envios.MecanismoDeEnvio;
import ar.edu.unlp.info.oo1.ejercicio19.pagos.FormaDePago;

public class Pedido {

	private Producto producto;
	private MecanismoDeEnvio envio;
	private FormaDePago pago;
	private int cantSolicitada;
	
	public Pedido(Producto producto, int cantSolicitada, FormaDePago fPago, MecanismoDeEnvio envio) {
		this.producto = producto;
		this.cantSolicitada = cantSolicitada;
		this.pago = fPago;
		this.envio = envio;
	}
	
	public double costoTotal() {
		return pago.precioFinal(this.producto.getPrecio())
			 + envio.costoDeEnvio(this.producto.getVendedor().getDireccion(), this.producto.getVendedor().getDireccion());
	}
	
	public int getCantSolicitada() {
		return this.cantSolicitada;
	}
	
}
