package ar.edu.unlp.info.oo1.ejercicio19.pagos;

public class PagoAlContado implements FormaDePago{

	@Override
	public double precioFinal(double precioProd) {
		return precioProd;
	}

}
