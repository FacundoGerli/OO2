package ar.com.edu.unlp.ej_Excursiones;

public class Provisoria extends State {

	public Provisoria(Excursion excursion) {
		super(excursion);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Si la excursión no alcanza el cupo mínimo, la información es la siguiente: nombre, costo, fechas, punto de encuentro,
	 *  cantidad de usuarios faltantes para alcanzar el cupo mínimo.
	 */
	@Override
	public String toString() {
		return ("Nombre excursion:"+this.getExcursion().getNombre()+". Actualmente faltan "+(this.getExcursion().getCupoMinimo()-this.getExcursion().getListaAnotados().size())+
				" persona/s para alcanzar el cupo necesario");
	}
	@Override
	public void reservarCupo(Usuario user) {
		this.getExcursion().getListaAnotados().add(user);
		if(this.getExcursion().getListaAnotados().size() >= this.getExcursion().getCupoMinimo())this.getExcursion().setEstado(new EnCurso(this.getExcursion()));
	}

}
