package ar.com.edu.unlp.ej_adminProyectos;

public abstract class State{
	private Proyecto proyecto;

	public State(Proyecto proyecto) {
		super();
		this.proyecto = proyecto;
	}
	

	public abstract void aprobarEtapa();

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	public abstract void modificarMargenGanancia(double ganancia);
	
	

}
