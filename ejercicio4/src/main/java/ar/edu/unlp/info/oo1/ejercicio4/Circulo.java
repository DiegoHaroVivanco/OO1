package ar.edu.unlp.info.oo1.ejercicio4;

public class Circulo implements Cara{
	private double diametro;
	
	
	public double getDiametro() {
		return (this.getRadio() * 2);
	}
	
	public void setDiametro(double valor) {
		this.diametro = valor;
	}
	
	public double getRadio() {
		// El diámetro mide el doble del radio
		return (this.diametro / 2);
	}

	public void setRadio(double valor) {
		this.diametro = valor * 2;
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
	
	public double getArea() {
		return Math.PI * (Math.pow(this.getRadio(), 2));
	}

}
