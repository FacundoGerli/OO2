package ar.com.edu.unlp.ej_Excursiones;

public class Llena extends State{

	public Llena(Excursion excursion) {
		super(excursion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LLena";
	}

	@Override
	public void reservarCupo(Usuario user) {
		this.getExcursion().getListaEspera().add(user);
		
	}

}
