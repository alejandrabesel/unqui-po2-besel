package ar.edu.unq.poo2.tp4.supermercado;
import java.util.ArrayList;

public class Supermercado {
	
	String nombre;
	String direccion;
	ArrayList<Producto> listaDeProductos = new ArrayList<>();
	
	
	public Supermercado(String nombreSupermercado, String direccionSupermercado) {
		nombre = nombreSupermercado;
		direccion = direccionSupermercado;
	}
	
	public int getCantidadDeProductos() {
		return listaDeProductos.size();
	}
	
	public void agregarProducto(Producto productoAAgregar) {
		listaDeProductos.add(productoAAgregar);
	}
	
	public Double getPrecioTotal() {
		Double total = 0.0;
	        for (Producto elemento : listaDeProductos) {
	            total += elemento.precio;
	        }
        return total;
	}
}
