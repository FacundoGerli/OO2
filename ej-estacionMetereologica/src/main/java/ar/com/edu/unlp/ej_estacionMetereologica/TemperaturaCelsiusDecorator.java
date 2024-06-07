package ar.com.edu.unlp.ej_estacionMetereologica;

public class TemperaturaCelsiusDecorator extends WheatherDecorator {
	
	public TemperaturaCelsiusDecorator(Wheather clima) {
		super(clima);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String displayData(){
		return super.displayData() + this.getTemperaturaCelsius();
	}
	public String getTemperaturaCelsius() {
        double celsius = (this.getTemperatura() - 32) / 1.8;
        return String.format("%.2f", celsius);
    }

}
