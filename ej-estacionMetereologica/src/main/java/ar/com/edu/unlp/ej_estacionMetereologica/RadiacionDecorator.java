package ar.com.edu.unlp.ej_estacionMetereologica;

public class RadiacionDecorator extends WheatherDecorator {
	public RadiacionDecorator(Wheather clima) {
		super(clima);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		return super.displayData() + " Radiación solar: " + Math.round(this.getRadiacionSolar());
	}

}
