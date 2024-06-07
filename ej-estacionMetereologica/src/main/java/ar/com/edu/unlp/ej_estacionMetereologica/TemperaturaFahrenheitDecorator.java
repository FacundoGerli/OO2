package ar.com.edu.unlp.ej_estacionMetereologica;

public class TemperaturaFahrenheitDecorator extends WheatherDecorator {
	
	public TemperaturaFahrenheitDecorator(Wheather clima) {
		super(clima);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData(){
		return super.displayData() + this.getTemperatura();
	}
}
