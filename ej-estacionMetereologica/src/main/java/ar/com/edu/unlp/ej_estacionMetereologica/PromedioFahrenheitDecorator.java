package ar.com.edu.unlp.ej_estacionMetereologica;

public class PromedioFahrenheitDecorator extends WheatherDecorator{
	
	public PromedioFahrenheitDecorator(Wheather clima) {
		super(clima);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData(){
		return super.displayData() + this.getPromedioTemperatura();
	}
	
	public String getPromedioTemperatura() {
		return  Double.toString(this.getTemperaturas().stream().mapToDouble(temp->temp).average().orElse(0));	
		}

}
