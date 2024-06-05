package ar.com.edu.unlp.ej_Excursiones;

public abstract class State {
	private Excursion excursion;

	public State(Excursion excursion) {
		super();
		this.excursion = excursion;
	}

	public Excursion getExcursion() {
		return excursion;
	}

	public void setExcursion(Excursion excursion) {
		this.excursion = excursion;
	}
	@Override
	public abstract String toString();
	public abstract void reservarCupo(Usuario user);
	
}
