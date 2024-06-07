package ar.com.edu.unlp.ej_estacionMetereologica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemperaturaTest {
	private HomeWeatherStation estacion;
	private WheatherDecorator adaptador;
	private PresionDecorator presion;
	private RadiacionDecorator radiacion; 
	private TemperaturaCelsiusDecorator celsius;
	private PromedioCelsiusDecorator promedioCelsius;
	private PromedioFahrenheitDecorator promedioFahrenheit;

	@BeforeEach
	public void setUp() throws Exception {
		//23.5 + 23.5 + 30
		this.estacion = new HomeWeatherStation(82.4, 1008, 500);
		this.estacion.addTemperaturasFahrenheit(70);
		this.estacion.addTemperaturasFahrenheit(80);
		this.estacion.addTemperaturasFahrenheit(81);
		this.adaptador = new WheatherDecorator(estacion);
	}

	@Test
	public void testDisplayDataOpcion2() {
		//Ejemplo 2:    “Presión atmosférica: 1008  Radiación solar: 500”
		this.presion = new PresionDecorator(adaptador);
		this.radiacion = new RadiacionDecorator(this.presion);
		
		assertEquals(" Presión atmosférica: 1008 Radiación solar: 500", this.radiacion.displayData());
		
	}

	@Test
	public void testDisplayDataOpcion3() {
		//Ejemplo 3: “Radiación solar: 500  Temperatura C: 28  Promedio de temperaturas C: 25”
		this.radiacion = new RadiacionDecorator(adaptador);
		this.celsius = new TemperaturaCelsiusDecorator(radiacion);
		this.promedioCelsius = new PromedioCelsiusDecorator(celsius);
		
		assertEquals("Radiación solar: 500 Temperatura C: 28.00 Promedio de temperaturas C: 25.00", this.promedioCelsius.displayData());

	}
}

