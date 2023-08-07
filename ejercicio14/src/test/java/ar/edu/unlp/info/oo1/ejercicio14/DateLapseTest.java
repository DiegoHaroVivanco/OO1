package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {

	private DateLapse dateLapse1;
	private DateLapse dateLapse2;
	private DateLapse dateLapse3;
	
	@BeforeEach
	public void setUp() {
		this.dateLapse1 = new DateLapse();
		this.dateLapse2 = new DateLapse(LocalDate.of(2021, 10, 10), LocalDate.of(2021, 10, 13)); 
		this.dateLapse3 = new DateLapse(LocalDate.of(2021, 10, 12), LocalDate.of(2021, 10, 10)); // fecha alrevez
		// puedo restar las 2 fechas para el  from(osea la fecha de inicio - fecha de fin)
		//asi mantienen los mismo dias o al parámetro to asignarle una fecha determinada
	}
	
	@Test
	public void testGetTo() {
		assertEquals(LocalDate.of(2010, 1, 1), this.dateLapse1.getTo());
		assertEquals(LocalDate.of(2021, 10, 13), this.dateLapse2.getTo());
		assertEquals(LocalDate.of(2021, 10, 12), this.dateLapse3.getTo());
	}
	
	@Test
	public void testSizeInDays() {
		assertEquals(7305, this.dateLapse1.sizeInDays()); // calcular con fechas que no tengan mucha diferencia entre sí
		assertEquals(3, this.dateLapse2.sizeInDays());
		assertEquals(2, this.dateLapse3.sizeInDays());
	}
	
	@Test
	public void testIncludesDate() {
		assertTrue(this.dateLapse1.includesDate(LocalDate.of(2006, 10, 1)));
		assertFalse(this.dateLapse1.includesDate(LocalDate.of(1989, 12, 31)));
		assertFalse(this.dateLapse1.includesDate(LocalDate.of(2010, 1, 2)));
		
		assertFalse(this.dateLapse2.includesDate(LocalDate.of(2021, 10, 9)));
		assertFalse(this.dateLapse2.includesDate(LocalDate.of(2021, 10, 14)));
		assertTrue(this.dateLapse2.includesDate(LocalDate.of(2021, 10, 11)));
	}
	
}
