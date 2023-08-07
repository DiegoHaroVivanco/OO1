package ar.edu.unlp.info.oo1.ejercicio16;

import org.junit.jupiter.api.BeforeEach;

import ar.edu.unlp.info.oo1.politicas.CancelacionModerada;
import ar.edu.unlp.info.oo1.politicas.Politica;

public class OOBnbTest {

	private Usuario usuario;
	private Propiedad propiedad;
	private OOBnB sistema;
	private Politica politicaModerada;
	
	@BeforeEach
	public void setUp() {
		sistema = new OOBnB();
		propiedad = new Propiedad("abc", "PH", 3000, "calle 12", new CancelacionModerada());
		usuario = new Usuario("Juan", "Calle 2", "40.433.322");
	}
	
}
