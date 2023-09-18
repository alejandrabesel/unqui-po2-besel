package ar.edu.unq.poo2.tp2;
import java.util.Date;

public class PlantaTemporaria extends Empleado{
	 Date fechaFinPlantaTemp;
     int cantidadHorasExtras;

    public int getHorasExtra() {
        // Implementa la lógica para obtener las horas extras
        return 0;
    }

    @Override
    public double getSueldoBruto() {
        // Implementa la lógica para calcular el sueldo bruto de un empleado de planta temporaria
        return 0.0;
    }

    @Override
    public double getSueldoNeto() {
        // Implementa la lógica para calcular el sueldo neto de un empleado de planta temporaria
        return 0.0;
    }

    @Override
    public double getRetenciones() {
        // Implementa la lógica para calcular las retenciones de un empleado de planta temporaria
        return 0.0;
    }
}
