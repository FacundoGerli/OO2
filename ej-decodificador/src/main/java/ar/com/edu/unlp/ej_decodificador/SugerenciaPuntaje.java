package ar.com.edu.unlp.ej_decodificador;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaPuntaje implements SugerenciaStrategy {

	@Override
	public List<Pelicula> recomedar(Decodificador deco) {
		return deco.getCatalogo().stream()
        .filter(pelicula -> !deco.getPeliculasVistas().contains(pelicula))
        .sorted((pel1, pel2) -> Double.compare(pel2.getPuntaje(), pel1.getPuntaje())) // Ordenar de mayor a menor puntuación
        .collect(Collectors.toList());
	}
}