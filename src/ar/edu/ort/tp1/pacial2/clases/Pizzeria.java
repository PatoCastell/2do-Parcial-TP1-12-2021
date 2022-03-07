package ar.edu.ort.tp1.pacial2.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Cola;

public class Pizzeria implements Mostrable {

	private static final String MSG_PIZZA_TOPPINGS_NULO = "No se pudo fabricar Pizza o Topping nulo.";
	private static final String MSG_TOPPINGS = "Error de parámetros incorporando toppings";
	private static final String MSG_TOTALES = "La venta total fue: $%8.2f\n";
	private static final String MSG_CANTIDADES = "Se han fabricado: %d Tradicionales, %d Especiales y %d Rectangulares\n";
	private String nombre;
	private int[][] cantCadaTopping;
	private Cola<String> errores;
	private PizzasPorPrecio pizzas;
	private int contEspecial;
	private int contRectangular;
	private int contTradicional;

	public Pizzeria(String nombre) {
		this.nombre = nombre;
		errores = new ColaNodos<>();
		pizzas = new PizzasPorPrecio();
		cantCadaTopping = new int[Topping.values().length][TipoPizza.values().length];
		for (int iFila = 0; iFila < cantCadaTopping.length; iFila++) {
			for (int iCol = 0; iCol < TipoPizza.values().length; iCol++) {
				cantCadaTopping[iFila][iCol] = 0;
			}
		}
	}

	public void incorporarTopping(TipoPizza tipoPizza, Topping topping, int cantidad) {

		if (topping == null || tipoPizza == null || cantidad <= 0) {
			throw new RuntimeException(MSG_TOPPINGS);
		}
		cantCadaTopping[topping.ordinal()][tipoPizza.ordinal()] = cantidad;
	}

	public void ingresarPedido(Pizza p, Topping topping) {

		if (p == null || topping == null) {
			errores.add(MSG_PIZZA_TOPPINGS_NULO);
			throw new RuntimeException(MSG_PIZZA_TOPPINGS_NULO);
		}else {
		
		if (cantCadaTopping[topping.ordinal()][p.tipo().ordinal()] < 1) {
			errores.add("No se pudo fabricar " + p.getNombre() + "por falta de topping " + topping);
			throw new RuntimeException("No se pudo fabricar " + p.getNombre() + "por falta de topping " + topping);
		}
		
		pizzas.add(p);
		sumarContador(p.tipo());
		cantCadaTopping[topping.ordinal()][p.tipo().ordinal()]--;

	}}

	private void sumarContador(TipoPizza tipo) {
		if (tipo == TipoPizza.ESPECIAL) {
			contEspecial++;
		} else if (tipo == TipoPizza.RECTANGULAR) {
			contRectangular++;
		} else if (tipo == TipoPizza.TRADICIONAL) {
			contTradicional++;
		}
	}

	@Override
	public void mostrar() {
		System.out.println("Pizzeria: " + nombre);
		System.out.printf(MSG_CANTIDADES, contTradicional, contEspecial, contRectangular);
		System.out.printf(MSG_TOTALES, ventaTotal());
		System.out.println("-----------------------------------------");
		listarPizzasPorPrecio();
		System.out.println("-----------------------------------------");
		listarErrores();
	}

	private void listarErrores() {
		String errorActual;
		while (!errores.isEmpty()) {
			errorActual = errores.remove();
			System.out.println(errorActual);
		}

	}

	private void listarPizzasPorPrecio() {
		System.out.println("Pizzas fabricadas por precio: ");
		for (Pizza p : pizzas) {
			p.mostrar();
		}

	}

	private float ventaTotal() {
		float total = 0;
		for (Pizza p : pizzas) {
			total += p.getPrecioDeVenta();
		}
		return total;
	}

	public String vendidasConPrecioEntre(int minimo, int maximo) {
		int contador = 0;
		String msj = null;
		for (Pizza p : pizzas) {
			if (p.getPrecioDeVenta() > minimo && p.getPrecioDeVenta() < maximo) {
				contador++;
			}
			msj = "Cantidad de Pizzas pedidas entre $" + minimo + " y $" + maximo + "?: " + contador;
		}
		return msj;
	}

}
