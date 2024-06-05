package ar.com.edu.unlp.ejercicioToDoItem;

import java.time.LocalDateTime;

public class Paused extends State{

	public Paused(ToDoItem task) {
		super(task);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void togglePause() {
		this.getTask().setState(new InProgress(this.getTask()));
		
	}

	@Override
	public void finish() {
		this.getTask().setState(new Finished(this.getTask()));
		this.getTask().setEnd(LocalDateTime.now());
		
	}

}
