package ar.com.edu.unlp.ej_decodificador;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaSimilaridad implements SugerenciaStrategy{

	@Override
	public List<Pelicula> recomedar(Decodificador deco) {
		return deco.getCatalogo().stream()
                .flatMap(pelicula -> pelicula.getSimilares().stream()) // Obtener todas las películas similares
                .filter(pelicula -> !pelicula.getVista(deco.getPeliculasVistas())) // Filtrar las películas similares que no han sido vistas
                .distinct() // Eliminar duplicados
                .collect(Collectors.toList());
	}

}
