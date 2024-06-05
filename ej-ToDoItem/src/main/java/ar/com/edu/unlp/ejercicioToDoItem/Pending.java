package ar.com.edu.unlp.ejercicioToDoItem;

public class Pending extends State{

	public Pending(ToDoItem task) {
		super(task);
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("Error al intentar togglePause. Tarea en estado Pending");
	}
	@Override
	public void start() {
		this.getTask().setState(new InProgress(this.getTask()));
	}

}
