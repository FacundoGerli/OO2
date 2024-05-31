package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada {

	public LlamadaNacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
		// TODO Auto-generated constructor stub
	}
	public double costoPorTipoDeLlamada() {
			// el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
		return this.getDuracion() * 3 + (this.getDuracion() * 3 * 0.21);
	}
	

}
