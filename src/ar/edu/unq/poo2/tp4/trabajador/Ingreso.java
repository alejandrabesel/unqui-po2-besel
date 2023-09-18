package ar.edu.unq.poo2.tp4.trabajador;
import java.time.Month;

public class Ingreso {

	Month mesPercepcion;
	String concepto;
	Double montoPercibido;
	
	public Ingreso(Month mesPercepcionIngreso, String conceptoIngreso, Double montoPercibidoIngreso) {
		mesPercepcion = mesPercepcionIngreso;
		concepto = conceptoIngreso;
		montoPercibido = montoPercibidoIngreso;
	}
	
	public Double getMontoImponible() {
		return montoPercibido;
	}
	
	public String getConcepto() {
		return concepto;
	}
	
	public Double getMontoPercibido() {
		return montoPercibido;
	}
	
	public Month getMesPercibido() {
		return mesPercepcion;
	}
}
