package ar.edu.unlp.info.oo2.biblioteca;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JsonAdapterTest {
	private Biblioteca biblio;
	
	@BeforeEach()
	public void inicializar() {
		biblio = new Biblioteca();
		this.biblio.setExporter(new JsonAdapter());
		this.biblio.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		this.biblio.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
	}
	
	@Test
	public void test2(){
		assertTrue(biblio.exportarSocios().contains("Arya Stark"));
		assertTrue(biblio.exportarSocios().contains("needle@stark.com"));
		assertTrue(biblio.exportarSocios().contains("5234-5"));
		
		assertTrue(biblio.exportarSocios().contains("Tyron Lannister"));
		assertTrue(biblio.exportarSocios().contains("tyron@thelannisters.com"));
		assertTrue(biblio.exportarSocios().contains("2345-2"));
	}

}
