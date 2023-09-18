package ar.edu.unq.poo2.tp2;
import java.util.Date;

public class Empleado {

     String nombre;
     String direccion;
     String estadoCivil;
     Date fechaNacimiento;
     double sueldoBasico;

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    

    
    public int edad() {
        // Implementa la lógica para calcular la edad
        return this.getFechaNacimiento().getYear();
    }

    public double getSueldoBruto() {
        // Implementa la lógica para calcular el sueldo bruto
        return 0.0;
    }

    public double getSueldoNeto() {
        // Implementa la lógica para calcular el sueldo neto
        return 0.0;
    }

    public double getRetenciones() {
        // Implementa la lógica para calcular las retenciones
        return 0.0;
    }
}
