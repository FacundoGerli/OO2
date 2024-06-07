package ar.com.edu.unlp.ej_decodificador;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Decodificador {
	private List<Pelicula> catalogo;
	private SugerenciaStrategy algoritmo;
	private List<Pelicula> peliculasVistas;
	
	public Decodificador() {
		this.catalogo = new ArrayList<Pelicula>();
		this.peliculasVistas = new ArrayList<Pelicula>();
		this.algoritmo = new SugerenciaNovedad();
	}
	
	public void agregarPelicula(Pelicula peli) {
		this.catalogo.add(peli);
	}
	public List<Pelicula> findAllPeliculas(){
		return this.catalogo;
	}
	public List<Pelicula> sugerirPelicula() {
		return this.algoritmo.recomedar(this);
	}
	public List<Pelicula> getCatalogo() {
		return catalogo;
	}
	public void setCatalogo(List<Pelicula> peliculas) {
		this.catalogo = peliculas;
	}
	public SugerenciaStrategy getAlgoritmo() {
		return algoritmo;
	}
	public void setAlgoritmo(SugerenciaStrategy algoritmo) {
		this.algoritmo = algoritmo;
	}
	public List<Pelicula> getPeliculasVistas() {
		return peliculasVistas;
	}
	public void setPeliculasVistas(List<Pelicula> peliculasVistas) {
		this.peliculasVistas = peliculasVistas;
	}
	public void añadirPeliculaVista(Pelicula peli) {
		this.peliculasVistas.add(peli);
	}
	
}
