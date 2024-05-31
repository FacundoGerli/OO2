package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class ObtenerNumeroLibreRandom implements IObtenerNumeroStrategy{

	@Override
	public String obtenerNumero(SortedSet<String> lineas) {
		String linea = new ArrayList<String>(lineas)
				.get(new Random().nextInt(lineas.size()));
		lineas.remove(linea);
		return linea;
	}

}
