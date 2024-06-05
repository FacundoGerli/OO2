package ar.com.edu.unlp.ej_Excursiones;

public class EnCurso extends State{

	public EnCurso(Excursion excursion) {
		super(excursion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return ("Faltan " + (this.getExcursion().getCupoMaximo()-this.getExcursion().getListaAnotados().size())+" para alcalzar el maximo");
	}

	@Override
	public void reservarCupo(Usuario user) {
		this.getExcursion().getListaAnotados().add(user);
		if(this.getExcursion().getListaAnotados().size() >= this.getExcursion().getCupoMaximo()) this.getExcursion().setEstado(new Llena(this.getExcursion()));
	}

}
