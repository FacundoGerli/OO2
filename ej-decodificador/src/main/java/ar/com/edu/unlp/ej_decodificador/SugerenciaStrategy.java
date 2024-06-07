package ar.com.edu.unlp.ej_decodificador;

import java.util.List;

public interface SugerenciaStrategy {
	public List<Pelicula> recomedar(Decodificador deco);
}
