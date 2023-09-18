package ar.edu.unq.poo2.tp4.trabajador;
import java.util.ArrayList;

public class Trabajador {
	ArrayList<Ingreso> ingresosPercibidos = new ArrayList<>();
	
	public Double getTotalPercibido() {
		Double total = 0.0;
        for (Ingreso elemento : ingresosPercibidos) {
            total += elemento.montoPercibido;
        }
    return total; 
	}
	
	public Double getMontoImponible() {
		Double total = 0.0;
        for (Ingreso elemento : ingresosPercibidos) {
            total += elemento.getMontoImponible(); // polimorfismo (lo entienden Ingreso e IngresoHE)
        }
    return total; 
	}
	
	public Double getImpuestoAPagar() {
		return this.getMontoImponible()* 0.2;
	}
	
	public void registrarIngreso(Ingreso ingresoARegistrar) {
		ingresosPercibidos.add(ingresoARegistrar);
	}
}
