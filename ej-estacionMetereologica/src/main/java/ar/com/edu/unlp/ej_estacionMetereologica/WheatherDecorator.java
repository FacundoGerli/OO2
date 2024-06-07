package ar.com.edu.unlp.ej_estacionMetereologica;

import java.util.List;

public class WheatherDecorator implements Wheather {
	private Wheather clima;

	public WheatherDecorator(Wheather clima) {
		this.clima = clima;
	}
	@Override
	public double getTemperatura() {
		return this.clima.getTemperatura();
	}

	@Override
	public double getPresion() {
		return this.clima.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		return this.clima.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturas() {
		return this.clima.getTemperaturas();
	}

	@Override
	public String displayData() {
		return this.clima.displayData();
	}
	


}
