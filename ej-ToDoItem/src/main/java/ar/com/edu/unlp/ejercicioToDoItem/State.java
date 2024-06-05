package ar.com.edu.unlp.ejercicioToDoItem;

import java.time.Duration;

public abstract class State {
	
	private ToDoItem task;
	
	public State(ToDoItem task) {
		this.task = task;
	}
	
	/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
	        public abstract void togglePause();
    /**
     * * * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
     * pending. Si se encuentra en otro estado, no hace nada.
     */
	        public void start() {
	        	
	        }
	      
	    	/**
	    	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
	    	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	    	*/
	   public void finish() {
	   }
	    	     
	/**
	 ** Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	 *  	    	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	    	    	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	    	    	* genera un error informando la causa específica del mismo.
	    	    	*/
	   public Duration workedTime() {
		   return Duration.between(task.getStart(), task.getEnd());
	   }
	   
		/**
		* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
		* contrario no hace nada."
		*/
		public void addComment(String comment) {
			this.getTask().getComentarios().add(comment);
		}

		public ToDoItem getTask() {
			return task;
		}

		public void setTask(ToDoItem task) {
			this.task = task;
		}
		


}
