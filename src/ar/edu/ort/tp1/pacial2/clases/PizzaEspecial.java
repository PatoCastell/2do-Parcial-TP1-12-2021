package ar.edu.ort.tp1.pacial2.clases;

public class PizzaEspecial extends Pizza {

	private static final int PRECIO_FAINA = 70;
	private TamanioDePizza tamanio;
	private int cantFaina;
	
	
	public PizzaEspecial(String nombre, float costoDeProduccion, float porcentajeGanancia, int cantFaina,
			TamanioDePizza tamanio) {
		super(nombre, costoDeProduccion, porcentajeGanancia);
		this.tamanio = tamanio;
		this.cantFaina = cantFaina;
	}


	@Override
	public TipoPizza tipo() {
		
		return TipoPizza.ESPECIAL;
	}


	@Override
	public float getPrecioDeCosto() {
		return (costoBase() *tamanio.getPorcentaje())+(cantFaina * PRECIO_FAINA);
	}


	@Override
	public void mostrar() {
		System.out.println(tipo()+"-"+getNombre()+"- Precio de venta: "+getPrecioDeVenta() + cantFaina +" faina "+this.tamanio);
		
	}
	
	
	

}
