package ar.com.edu.unlp.ej_adminProyectos;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
	private Proyecto proyecto;
	private Proyecto proyecto0;
	@BeforeEach
	public void inicializar() {
		proyecto = new Proyecto("Aprobar parcial",3,10000,LocalDateTime.of(2024,06, 5, 4, 25), LocalDateTime.of(2024,06, 8, 4, 25));
		proyecto0 = new Proyecto("Aprobar parcial",3,10000,LocalDateTime.of(2024,06, 5, 4, 25), LocalDateTime.of(2024,06, 8, 4, 25));
}
	@Test
	public void testProyecto() {
		Assertions.assertTrue(proyecto.getState() instanceof EnConstruccion);
		Assertions.assertEquals(proyecto.getMargenGanancia(), 0.07);
		
}
}
