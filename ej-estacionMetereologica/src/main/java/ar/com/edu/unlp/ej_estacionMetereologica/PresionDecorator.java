package ar.com.edu.unlp.ej_estacionMetereologica;

public class PresionDecorator extends WheatherDecorator {
	
	public PresionDecorator(Wheather clima) {
		super(clima);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData(){
	return super.displayData() + " Presión atmosférica: " + Math.round(this.getPresion());
	}
}
