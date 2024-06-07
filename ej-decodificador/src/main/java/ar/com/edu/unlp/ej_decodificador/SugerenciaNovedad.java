package ar.com.edu.unlp.ej_decodificador;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaNovedad implements SugerenciaStrategy{

	@Override
	public List<Pelicula> recomedar(Decodificador deco) {
		return deco.getCatalogo().stream().sorted((pel1,pel2)-> pel2.getEstreno().compareTo(pel1.getEstreno())).collect(Collectors.toList()).subList(0,3);
	}
	

}