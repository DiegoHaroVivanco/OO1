package ar.edu.unlp.info.oo1.ejercicio7;

public class Test {

	public static void main(String[] args) {
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		
		System.out.println("Aportes de Alan: " + aportesDeAlan); // 2850
		System.out.println("Sueldo básico: "+ sueldoBasicoDeAlan); // 67850
	
	}

}
