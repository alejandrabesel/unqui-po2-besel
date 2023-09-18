package ar.edu.unq.poo2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class IngresoTest {
	
	private Ingreso ingresoEnero;
	private Ingreso ingresoFebrero;
	
	@BeforeEach
	public void setUp() {
		ingresoEnero = new Ingreso(Month.JANUARY, "Sueldo", 1000.0);
		ingresoFebrero = new Ingreso(Month.FEBRUARY, "Cuota", 200.0);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Sueldo", ingresoEnero.getConcepto());
		assertEquals(new Double(1000.0), ingresoEnero.getMontoPercibido());
		assertEquals(Month.JANUARY, ingresoEnero.getMesPercibido());
		
		assertEquals("Cuota", ingresoFebrero.getConcepto());
		assertEquals(new Double(200.0), ingresoFebrero.getMontoPercibido());
		assertEquals(Month.FEBRUARY, ingresoFebrero.getMesPercibido());	
	}
	
	@Test
	public void testGetMontoImponible() {	
		assertEquals(new Double(1000.0), ingresoEnero.getMontoImponible());
		assertEquals(new Double(200.0), ingresoFebrero.getMontoImponible());
	}
	
}
