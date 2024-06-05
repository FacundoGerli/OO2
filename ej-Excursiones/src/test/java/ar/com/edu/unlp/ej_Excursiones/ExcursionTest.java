package ar.com.edu.unlp.ej_Excursiones;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	private Excursion excursion;
	@BeforeEach
	public void inicializar() {
		this.excursion = new Excursion("Dos días en kayak bajando el Paraná",LocalDateTime.of(2024,4,28,17,00),
			LocalDateTime.of(2024,4,30,17,00) 
			,"La Plata",25000,1,2);
	}
	@Test
	public void provisoriaTest() {
		Assertions.assertTrue(this.excursion.getEstado() instanceof Provisoria);
		Assertions.assertEquals("Nombre excursion:Dos días en kayak bajando el Paraná. Actualmente faltan 1 persona/s para alcanzar el cupo necesario",
				this.excursion.toString());
	}	

}
