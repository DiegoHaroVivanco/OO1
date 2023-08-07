package ar.edu.unlp.info.oo1.ejercicio9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CuentaTest {

	private CuentaCorriente cuentaCorriente1;
	private CuentaCorriente cuentaCorriente2;
	private CajaDeAhorro cajaDeAhorro1;
	private CajaDeAhorro cajaDeAhorro2;
	
	@BeforeEach
	public void setup() {
		this.cuentaCorriente1 = new CuentaCorriente(5000, 2000);
		this.cuentaCorriente2 = new CuentaCorriente(2000, 500);
		this.cajaDeAhorro1 = new CajaDeAhorro(2000);
		this.cajaDeAhorro2 = new CajaDeAhorro(4000);
	}
	
	@Test
	public void testExtraer() {
		assertTrue(cuentaCorriente1.extraer(7000));
		assertEquals(-2000, cuentaCorriente1.getSaldo());
		assertFalse(cuentaCorriente1.extraer(10));
		cuentaCorriente1.depositar(2000);
		assertEquals(0, cuentaCorriente1.getSaldo());
		
		assertFalse(cuentaCorriente2.extraer(2501));
		assertTrue(cuentaCorriente2.extraer(2400));
		assertEquals(-400, cuentaCorriente2.getSaldo());
		assertTrue(cuentaCorriente2.extraer(100));
		assertEquals(-500, cuentaCorriente2.getSaldo());
		assertFalse(cuentaCorriente2.extraer(100));
		cuentaCorriente2.depositar(100);
		assertTrue(cuentaCorriente2.extraer(100));
		
		assertTrue(cajaDeAhorro1.extraer(1000));
		assertEquals(980, cajaDeAhorro1.getSaldo());
		assertFalse(cajaDeAhorro1.extraer(990));
		assertTrue(cajaDeAhorro2.extraer(3900));
		assertEquals(22, cajaDeAhorro2.getSaldo());
		assertFalse(cajaDeAhorro2.extraer(22));
		cajaDeAhorro2.depositar(200);
		assertEquals(218, cajaDeAhorro2.getSaldo());
	
	}
	
	@Test
	public void testTransferir() {
		assertTrue(cuentaCorriente1.trasferirACuenta(7000, cajaDeAhorro1));
		assertEquals(8860, cajaDeAhorro1.getSaldo());
		assertFalse(cuentaCorriente1.trasferirACuenta(200, cajaDeAhorro1));
		assertTrue(cajaDeAhorro1.trasferirACuenta(5000, cuentaCorriente1));
		assertEquals(3000, cuentaCorriente1.getSaldo());
		assertEquals(3760, cajaDeAhorro1.getSaldo());
	}
	
	
	

}
