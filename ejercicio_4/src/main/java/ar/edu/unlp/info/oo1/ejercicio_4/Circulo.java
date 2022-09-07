package ar.edu.unlp.info.oo1.ejercicio_4;

public class Circulo implements Figura{
// tambien se puede guardar diametro ? 
	private double radio;

	public double getDiametro() {
		return this.radio *	2;
	}
	
	public void setDiametro(double diametro) {
		this.radio=diametro / 2;
	}

	public double getPerimetro() {
		return Math.PI*this.getDiametro();
	}
	

	
	public double getRadio() {
		return radio;
	}
	
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getArea() {
		return	Math.PI*(Math.pow(this.radio, 2));
	}
}
