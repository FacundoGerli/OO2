package ar.com.edu.unlp.ejercicioToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String name;
	private State state;
	private LocalDateTime start;
	private LocalDateTime end;
	private List<String> comentarios;
	/**
	* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	*/
	public ToDoItem(String name) {
	        	this.name = name;
	        	this.comentarios = new ArrayList<String>();
	        	this.setState(new Pending(this));
	        	}
	
	   	/**
	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	* pending. Si se encuentra en otro estado, no hace nada.
	*/
	        public void start() {
	        	this.getState().start();
	        }

		/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
	        public void togglePause() {
	        	this.getState().togglePause();
	        }


		/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
	        public void finish() {
	        	this.getState().finish();
	        }


		/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	* genera un error informando la causa específica del mismo.
	*/
	        public Duration workedTime() {
	        	return this.getState().workedTime();
	        }


	/**
	* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."
	*/
	        public void addComment(String comment) {
	        	this.getState().addComment(comment);
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public LocalDateTime getStart() {
		return start;
	}
	public void setStart( LocalDateTime  start) {
		this.start = start;
	}
	public  LocalDateTime getEnd() {
		return end;
	}
	public void setEnd(LocalDateTime end) {
		this.end = end;
	}
	public List<String> getComentarios() {
		return comentarios;
	}





}
