package ar.com.edu.unlp.ej_estacionMetereologica;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation implements Wheather {
	private double temperatura;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturas;
	

	public void addTemperaturasFahrenheit(double temp) {
		temperaturas.add(temp);
	}
	public HomeWeatherStation(double temperatura, double presion, double radiacionSolar) {
		super();
		this.temperatura = temperatura;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temperaturas = new ArrayList<Double>();
	}

	@Override
	public String displayData(){
	return " ";
	}

	@Override
	public double getTemperatura() {
		return this.temperatura;
	}

	@Override
	public double getPresion() {
		return this.presion;
	}

	@Override
	public double getRadiacionSolar() {
		return this.radiacionSolar;
	}

	@Override
	public List<Double> getTemperaturas() {
		return this.temperaturas;
	}

}
