package ar.edu.ort.tp1.pacial2.clases;

public abstract class Pizza implements Mostrable {

	private static final String MSG_GANANCIA_INVALIDA = "Ganancia inválida";
	private static final String MSG_COSTO_INVALIDO = "Costo inválido";
	private static final String MSG_NOMBRE_INVALIDO = "Nombre inválido";

	private String nombre;
	private float costoDeProduccion;
	private float porcentajeGanancia;
	private TipoPizza tipo;
	public Pizza(String nombre, float costoDeProduccion, float porcentajeGanancia) {

		this.setCostoDeProduccion(costoDeProduccion);
		this.setNombre(nombre);
		this.setPorcentajeGanancia(porcentajeGanancia);
	}
	private  void setNombre(String nombre) {
		if(nombre==null||nombre.isBlank()) {
			throw new RuntimeException(MSG_NOMBRE_INVALIDO);
		}
		this.nombre = nombre;
	}
	private void setCostoDeProduccion(float costoDeProduccion) {
		if(costoDeProduccion<=0) {
			throw new RuntimeException(MSG_COSTO_INVALIDO);
		}
		this.costoDeProduccion = costoDeProduccion;
	}
	private void setPorcentajeGanancia(float porcentajeGanancia) {
		if(porcentajeGanancia<0) {
			throw new RuntimeException(MSG_GANANCIA_INVALIDA);
		}
		this.porcentajeGanancia = porcentajeGanancia;
	}
	
	
	
	public abstract float getPrecioDeCosto();
	
	public float costoBase() {
		return costoDeProduccion;
	}
	
	public abstract TipoPizza tipo();

	public abstract void mostrar();
		
	protected float getPrecioDeVenta() {
		return getPrecioDeCosto() *(1+porcentajeGanancia/100);
	}
	protected String getNombre() {
		return nombre;
	}
	
	
}
