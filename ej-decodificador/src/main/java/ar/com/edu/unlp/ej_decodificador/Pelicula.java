package ar.com.edu.unlp.ej_decodificador;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private LocalDateTime estreno; //Mas eficiente usar Year
	private List<Pelicula> similares;
	private double puntaje;
	private Boolean vista;
	
	public Pelicula(String titulo, LocalDateTime estreno, double puntaje) {
		super();
		this.titulo = titulo;
		this.estreno = estreno;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDateTime getEstreno() {
		return estreno;
	}

	public void setEstreno(LocalDateTime estreno) {
		this.estreno = estreno;
	}

	public List<Pelicula> getSimilares() {
		return similares;
	}

	public void setSimilares(List<Pelicula> similares) {
		this.similares = similares;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}
	
	public boolean getVista(List<Pelicula> catalogoVistas) {
		return (catalogoVistas.contains(this)) ? true : false;
	}
	public void agregarSimilar(Pelicula peli) {
		this.similares.add(peli);
	}

}
