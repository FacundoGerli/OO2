package ar.com.edu.unlp.ej_adminProyectos;

public class EnConstruccion extends State  {

	public EnConstruccion(Proyecto proyecto) {
		super(proyecto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aprobarEtapa() {
		if(this.getProyecto().calcularPrecioProyecto() > 0 )  this.getProyecto().setState(new EnEvaluacion(this.getProyecto()));
		else {
			throw new RuntimeException("EL proyecto no alcanzo el precio necesario");
		}
	}

	@Override
	public void modificarMargenGanancia(double ganancia) {
		if ((ganancia>0.08) && (ganancia<0.1)) this.getProyecto().setMargenGanancia(ganancia);
		
	}

}
