package ar.edu.unq.poo2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp4.supermercado.ProductoPrimeraNecesidad;

public class IngresoPorHorasExtraTest {
	
	private IngresoPorHorasExtra horasFeriado;
	
	@BeforeEach
	public void setUp() {
		horasFeriado = new IngresoPorHorasExtra(Month.JUNE, "Horas feriado", 500.0, 5.0);
		
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Horas feriado", horasFeriado.getConcepto());
		assertEquals(new Double(500.0), horasFeriado.getMontoPercibido());
		assertEquals(Month.JUNE, horasFeriado.getMesPercibido());
		assertEquals(new Double(5.0), horasFeriado.getCantidadHorasExtra());
		
	}
	
	@Test
	public void testGetMontoImponible() {
		assertEquals(new Double(0.0), horasFeriado.getMontoImponible());
	}
}
