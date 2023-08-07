package ar.edu.unlp.info.oo1.ejercicio19.pagos;

public class PagoEnSeisCuotas implements FormaDePago{

	@Override
	public double precioFinal(double precioProd) {
		return precioProd + (precioProd * 0.20);
	}

}
