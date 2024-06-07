package ar.com.edu.unlp.ej_decodificador;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecodificadorTest {
	private Decodificador decodificador;
	private Pelicula thor;
	private Pelicula capitanAmerica;
	private Pelicula ironMan;
	private Pelicula dunkirk;
	private Pelicula rocky;
	private Pelicula rambo;
	

	@BeforeEach
	void setUp() throws Exception {
		this.thor = new Pelicula("Thor", LocalDateTime.of(2007,11,4,12,2),7.9);
		this.capitanAmerica = new Pelicula("Capitan America", LocalDateTime.of(2016,11,4,12,2),7.8);
		this.ironMan = new Pelicula("Iron Man", LocalDateTime.of(2010,11,4,12,2),7.9);
		this.dunkirk = new Pelicula("Dunkirk", LocalDateTime.of(2017,11,4,12,2),7.9);
		this.rocky = new Pelicula("Rocky", LocalDateTime.of(1979,11,4,12,2),8.1);
		this.rambo = new Pelicula("Rambo", LocalDateTime.of(1979,11,4,12,2),7.8);
		
		
		this.thor.agregarSimilar(ironMan);
		this.thor.agregarSimilar(capitanAmerica);
		this.capitanAmerica.agregarSimilar(thor);
		this.rocky.agregarSimilar(rambo);
		
		
		this.decodificador = new Decodificador();
		
		this.decodificador.agregarPelicula(thor);
		this.decodificador.agregarPelicula(capitanAmerica);
		this.decodificador.agregarPelicula(ironMan);
		this.decodificador.agregarPelicula(dunkirk);
		this.decodificador.agregarPelicula(rocky);
		this.decodificador.agregarPelicula(rambo);
		
		this.decodificador.añadirPeliculaVista(thor);
		this.decodificador.añadirPeliculaVista(rocky);
	}
	@Test
	void testObtenerSugerencias() {
		//this.decodificador.sugerirPelicula().forEach(pelicula -> System.out.println(pelicula.getTitulo()));
		assertTrue(this.decodificador.sugerirPelicula().contains(dunkirk));
		assertTrue(this.decodificador.sugerirPelicula().contains(capitanAmerica));
		assertTrue(this.decodificador.sugerirPelicula().contains(ironMan));
		this.decodificador.setAlgoritmo(new SugerenciaSimilaridad());
		assertTrue(this.decodificador.sugerirPelicula().contains(capitanAmerica));
		assertTrue(this.decodificador.sugerirPelicula().contains(ironMan));
		assertTrue(this.decodificador.sugerirPelicula().contains(rambo));
		this.decodificador.setAlgoritmo(new SugerenciaPuntaje());
		assertTrue(this.decodificador.sugerirPelicula().contains(capitanAmerica));
		assertTrue(this.decodificador.sugerirPelicula().contains(ironMan));
		assertTrue(this.decodificador.sugerirPelicula().contains(dunkirk));
		
	}
}
