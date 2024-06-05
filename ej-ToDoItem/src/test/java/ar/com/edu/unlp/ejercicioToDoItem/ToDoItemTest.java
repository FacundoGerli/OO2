package ar.com.edu.unlp.ejercicioToDoItem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class ToDoItemTest {
	private ToDoItem tareaIniciada;
	private ToDoItem tareaFinalizada;
	private ToDoItem tareaPausa;
	private ToDoItem tareaSinIniciar;
	@BeforeEach
	public void inicializar() {
		this.tareaIniciada = new ToDoItem("tarea1");
		this.tareaFinalizada = new ToDoItem("tarea2");
		this.tareaPausa = new ToDoItem("tarea3");
		this.tareaSinIniciar = new ToDoItem("Tarea 4");
		this.tareaIniciada.start();
		this.tareaFinalizada.start();
		this.tareaFinalizada.finish();
		this.tareaPausa.start();
		this.tareaPausa.togglePause();
	}
	@Test
	public void tareaIniciadaTest() {
		Assertions.assertTrue(this.tareaIniciada.getState() instanceof InProgress);
		Assertions.assertTrue(this.tareaFinalizada.getState() instanceof Finished);
		Assertions.assertTrue(this.tareaPausa.getState() instanceof Paused);
		Assertions.assertTrue(this.tareaSinIniciar.getState() instanceof Pending);
	}
	@Test
	public void togglePauseTest() {
		this.tareaPausa.togglePause();
		Assertions.assertTrue(this.tareaPausa.getState() instanceof InProgress);
		this.tareaIniciada.togglePause();
		Assertions.assertTrue(this.tareaIniciada.getState() instanceof Paused);
		Exception exceptionFinished = assertThrows(RuntimeException.class, () -> {this.tareaFinalizada.togglePause();});
		Assertions.assertEquals("Error al intentar togglePause. Tarea en estado Finished", exceptionFinished.getMessage());
		Exception exceptionPending = assertThrows(RuntimeException.class,() -> {this.tareaSinIniciar.togglePause();});
		Assertions.assertEquals("Error al intentar togglePause. Tarea en estado Pending", exceptionPending.getMessage());
	}
	@Test
	public void finishedTest() {
		this.tareaFinalizada.finish();
		Assertions.assertTrue(this.tareaFinalizada.getState() instanceof Finished);
		this.tareaIniciada.finish();
		Assertions.assertTrue(this.tareaIniciada.getState() instanceof Finished);
		this.tareaPausa.finish();
		Assertions.assertTrue(this.tareaPausa.getState() instanceof Finished);
		this.tareaSinIniciar.finish();
		Assertions.assertTrue(this.tareaSinIniciar.getState() instanceof Pending);
		
	}

}
