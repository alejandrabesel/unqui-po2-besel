package ar.edu.unq.poo2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto{

	Double descuento;
	
	public ProductoPrimeraNecesidad(String nombreProductoPrimeraNecesidad, Double precioProductoPrimeraNecesidad, boolean esCuidadoPrimeraNecesidad, Double descuentoProducto ) {
		super(nombreProductoPrimeraNecesidad, precioProductoPrimeraNecesidad, esCuidadoPrimeraNecesidad);
		descuento = new Double(descuentoProducto);
	}
	

	@Override
	public Double getPrecio() {
		return precio * descuento;
	}
}
