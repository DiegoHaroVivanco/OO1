package ar.edu.unlp.info.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.politicas.CancelacionFlexible;
import ar.edu.unlp.info.oo1.politicas.Politica;

public class ReservaTest {

	private DateLapse periodo1;
	private Reserva reserva1;
	private Propiedad propiedad1;
	private Usuario usuario1;
	private Politica politicaFlexible;
	
	
	@BeforeEach
	public void setUp() {
		periodo1 = new DateLapse(LocalDate.of(2021, 10, 22), LocalDate.of(2021, 10, 25)); // periodo = 3 días
		usuario1 = new Usuario("Pepe", "calle falsa", "40404");
		politicaFlexible = new CancelacionFlexible();
		propiedad1 = new Propiedad("Atlantis", "buenarda", 2000, "calle 123", politicaFlexible);
		
		reserva1 = new Reserva(propiedad1, periodo1, usuario1);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(6000, reserva1.calcularPrecio());
	}
	
	@Test
	public void testEntrePeriodo() {
		assertTrue(reserva1.entrePeriodo(new DateLapse(LocalDate.of(2021, 10, 20), LocalDate.of(2021, 10, 26))));
		assertFalse(reserva1.entrePeriodo(new DateLapse(LocalDate.of(2021, 10, 19), LocalDate.of(2021, 10, 24))));
	}
	
}
