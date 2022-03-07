package ar.edu.ort.tp1.pacial2.clases;

public class PizzaTradicional extends Pizza {

	private TipoDeMasa tipo;
	
	
	public PizzaTradicional(String nombre, float costoDeProduccion, float porcentajeGanancia, TipoDeMasa tipo) {
		super(nombre, costoDeProduccion, porcentajeGanancia);
		this.tipo = tipo;
	
	}
	
	
	@Override
	public TipoPizza tipo() {
		return TipoPizza.TRADICIONAL;
	}

	@Override
	public float getPrecioDeCosto() {
		return costoBase() * 1+(tipo.getPorcentaje()/100);
	}


	@Override
	public void mostrar() {
		System.out.println(tipo()+"-"+getNombre()+"- Precio de venta: "+getPrecioDeVenta() + tipo);		
	}

}
