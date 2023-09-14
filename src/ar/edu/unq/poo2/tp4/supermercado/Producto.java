package ar.edu.unq.poo2.tp4.supermercado;


public class Producto {
	
	String nombre;
	Double precio;
	boolean esPrecioCuidado = false;
	
	public Producto(String nombreProducto, Double precioProducto, boolean esCuidado ) {
		this.setValues(nombreProducto, precioProducto);
		esPrecioCuidado = esCuidado;
	}
	
	public Producto(String nombreProducto, Double precioProducto) {
		this.setValues(nombreProducto, precioProducto);
	}
	
	private void setValues(String nombreProducto, Double precioProducto) {
		nombre = nombreProducto;
		precio = precioProducto;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public void esPrecioCuidado(boolean esCuidado) {
		esPrecioCuidado = esCuidado;
	}
	
	public void aumentarPrecio(Double aumento) {
		precio += aumento;
	}
}
