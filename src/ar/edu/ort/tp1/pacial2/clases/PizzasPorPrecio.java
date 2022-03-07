package ar.edu.ort.tp1.pacial2.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class PizzasPorPrecio extends ListaOrdenadaNodos<Float, Pizza> {

	

	@Override
	public int compare(Pizza dato1, Pizza dato2) {
		int result = 0;
		if(dato1.getPrecioDeVenta()-dato2.getPrecioDeVenta()<0) {
			result = -1;
		}else if (dato1.getPrecioDeVenta()-dato2.getPrecioDeVenta()>0) {
			result = 1;
		}
		return result;
	}

	@Override
	public int compareByKey(Float clave, Pizza elemento) {
		int result = 0;
		if(clave-elemento.getPrecioDeVenta()<0) {
			result = -1;
		}else if (clave-elemento.getPrecioDeVenta()>0) {
			result = 1;
		}		return result;
	}

}
