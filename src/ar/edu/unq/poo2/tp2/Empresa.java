package ar.edu.unq.poo2.tp2;

public class Empresa {
	
	String nombre; // si no aclaras es private o public?
    String cuit;
    
    public Empresa(String nombre, String cuit) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
	}
    
    public String getName() {
    	return nombre;
    }
    
	public String getCuit() {
		return cuit;
	}
     
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
    public double totalSueldosNeto() {
        // Implementa la lógica para calcular el total de sueldos netos de los empleados
        return 0.0;
    }

    public double totalSueldosBruto() {
        // Implementa la lógica para calcular el total de sueldos brutos de los empleados
        return 0.0;
    }

    public double totalRetenciones() {
        // Implementa la lógica para calcular el total de retenciones de los empleados
        return 0.0;
    }

}
