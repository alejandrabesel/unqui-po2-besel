package ar.edu.unq.poo2.tp4.trabajador;

import java.time.Month;

public class IngresoPorHorasExtra extends Ingreso{
	
	Double cantidadHorasExtra;
	
	public IngresoPorHorasExtra(Month mesPercepcionIngreso, String conceptoIngreso, Double montoPercibidoIngreso, Double cantidadHoras) {
		super(mesPercepcionIngreso, conceptoIngreso, montoPercibidoIngreso);
		cantidadHorasExtra = cantidadHoras;	
	}
	
	@Override
	public Double getMontoImponible() {
		return 0.0;
	}
	
	public Double getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}
}
