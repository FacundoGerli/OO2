package ar.com.edu.unlp.ejercicioToDoItem;

public class Finished extends State{

	public Finished(ToDoItem task) {
		super(task);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("Error al intentar togglePause. Tarea en estado Finished");
		
	}

}
