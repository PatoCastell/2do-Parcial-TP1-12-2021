package ar.edu.ort.tp1.pacial2.clases;

public class PizzaRectangular extends Pizza {

	private static final int PRECIO_PORCION = 45;
	private long largoPorciones;
	private long anchoPorciones;
	private AdicionalQueso adicional;


	public PizzaRectangular(String nombre, float costoDeProduccion, float porcentajeGanancia, long largo,
			long ancho, AdicionalQueso adicional) {
		super(nombre, costoDeProduccion, porcentajeGanancia);
		this.largoPorciones = largo;
		this.anchoPorciones = ancho;
		this.adicional = adicional;
	}





@Override
public float getPrecioDeCosto() {
	int cantPorciones = (int) (anchoPorciones * largoPorciones);
	return (costoBase()+(cantPorciones*PRECIO_PORCION))*adicional.getMultiplicadorQueso() ;
}


@Override
public TipoPizza tipo() {
	return TipoPizza.RECTANGULAR;
}





@Override
public void mostrar() {
	System.out.println(tipo()+"-"+getNombre()+"- Precio de venta: "+getPrecioDeVenta() + (anchoPorciones*largoPorciones)+" porciones "+adicional);
	
}
}