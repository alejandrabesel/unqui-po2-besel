package ar.edu.unq.poo2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto{

	String nombre;
	Double precio;
	boolean esPrecioCuidado = false;
	
	public ProductoPrimeraNecesidad(String nombreProducto, Double precioProducto, boolean esCuidado ) {
			super(nombreProducto, precioProducto, esCuidado);
	}
}
