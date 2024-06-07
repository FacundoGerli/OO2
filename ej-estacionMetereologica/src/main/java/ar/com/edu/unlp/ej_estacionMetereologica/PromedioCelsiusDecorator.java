package ar.com.edu.unlp.ej_estacionMetereologica;

public class PromedioCelsiusDecorator extends WheatherDecorator {
	
	public PromedioCelsiusDecorator(Wheather clima) {
		super(clima);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData(){
		return super.displayData() + this.getPromedioTemperaturaC();
	}
	
	public String getPromedioTemperaturaC() {
	    double promedio = this.getTemperaturas().stream()
                .mapToDouble(temp -> toCelsius(temp))
                .average()
                .orElse(0);
return String.format("%.2f", promedio);
}
	public double toCelsius(Double temp) {
		return ((temp - 32) / 1.8);
	}
}
