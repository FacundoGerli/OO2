package ar.com.edu.unlp.ej_estacionMetereologica;

import java.util.List;

public interface Wheather {
		public double getTemperatura();
		public double getPresion();
		public double getRadiacionSolar();
		public List<Double> getTemperaturas();
		public String displayData();

}
