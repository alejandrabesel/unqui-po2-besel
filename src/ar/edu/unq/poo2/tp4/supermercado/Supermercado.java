package ar.edu.unq.poo2.tp4.supermercado;

public class Supermercado {
	
	String nombre;
	String direccion;
	Producto arrayProductos[];
	
	public Supermercado(String nombreSupermercado, String direccionSupermercado) {
		nombre = nombreSupermercado;
		direccion = direccionSupermercado;
	}

	public int getCantidadDeProductos() {
		return arrayProductos.lenght;
	}
}
