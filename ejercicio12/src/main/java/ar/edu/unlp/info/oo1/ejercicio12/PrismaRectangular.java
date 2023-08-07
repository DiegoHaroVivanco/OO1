package ar.edu.unlp.info.oo1.ejercicio12;

public class PrismaRectangular extends Pieza {

	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	
	public PrismaRectangular(String material, String color, int ladoMayor, int ladoMenor, int altura) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
	
	public int getLadoMayor() {
		return this.ladoMayor;
	}
	
	public void setLadoMayor(int ladoMayor) {
		this.ladoMayor = ladoMayor;
	}
	
	public int getLadoMenor() {
		return this.ladoMenor;
	}
	
	public void setLadoMenor(int ladoMenor) {
		this.ladoMenor = ladoMenor;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public double volumen() {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}

	@Override
	public double superficie() {
		return 2 * (this.ladoMayor * this.ladoMenor + (this.ladoMayor * this.altura) + (this.ladoMenor * this.altura));
	}
	
	
}
