package ar.com.edu.unlp.ej_adminProyectos;

public class EnEvaluacion extends State {

	public EnEvaluacion(Proyecto proyecto) {
		super(proyecto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aprobarEtapa() {
		this.getProyecto().setState(new Confirmada(this.getProyecto()));
	}
	@Override
	public void modificarMargenGanancia(double ganancia) {
		if ((ganancia>0.11) && (ganancia<0.15)) this.getProyecto().setMargenGanancia(ganancia);
		
	}

}
