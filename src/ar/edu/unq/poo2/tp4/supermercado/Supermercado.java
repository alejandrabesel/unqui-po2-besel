package ar.edu.unq.poo2.tp4.supermercado;
import java.util.ArrayList;

public class Supermercado {
	
	String nombre;
	String direccion;
	ArrayList<Producto> arrayProductos = new ArrayList<>();
	
	
	public Supermercado(String nombreSupermercado, String direccionSupermercado) {
		nombre = nombreSupermercado;
		direccion = direccionSupermercado;
	}
	
	public int getCantidadDeProductos() {
		return arrayProductos.size();
	}
	
	public void agregarProducto(Producto productoAAgregar) {
		arrayProductos.add(productoAAgregar);
	}
	
	public Double getPrecioTotal() {
		Double total = 0.0;
	        for (Producto elemento : arrayProductos) {
	            total += elemento.precio;
	        }
        return total;
	}
}
