package ar.edu.unq.poo2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TrabajadorTest {
	
	private Ingreso ingresoJunio;
	private IngresoPorHorasExtra ingresoBonus;
	private Trabajador juan;
	
	@BeforeEach
	public void setUp() {
		ingresoJunio = new Ingreso(Month.JUNE, "Sueldo", 3000.0);
		ingresoBonus = new IngresoPorHorasExtra(Month.JULY, "Bonus por horas extra", 350.0, 3.5);
		juan = new Trabajador();
		juan.registrarIngreso(ingresoJunio);
		juan.registrarIngreso(ingresoBonus);
	}
	
	@Test
	public void testTotalPercibido() {
		assertEquals(3350.0, juan.getTotalPercibido());
	}
	
	@Test
	public void testMontoImponible() {
		assertEquals(3000.0, juan.getMontoImponible());
	}
	
	@Test
	public void testImpuestoAPagar() {
		assertEquals(600.0, juan.getImpuestoAPagar());
		
	}
	
}

