package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private IObtenerNumeroStrategy tipoGenerador = new ObtenerNumeroLibreUltimo();
	
	
	public SortedSet<String> getLineas() {
		return lineas;
	}
	public String obtenerNumeroLibre() {
		return tipoGenerador.obtenerNumero(this.getLineas());
	}

	public void cambiarTipoGenerador(IObtenerNumeroStrategy tipoGenerador) {
		this.tipoGenerador = tipoGenerador;
	}
	
	public boolean agregarNumeroTelefono(String numero) {
		if(!this.getLineas().contains(numero)) {
			return this.getLineas().add(numero);
		}
		else return false;
	}
		
}
