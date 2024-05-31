package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombre;
	private String numeroTelefono;

	public Cliente() {
		
	}
	public List<Llamada> getLlamadas() {
		return llamadas;
	}

	public void setLlamadas(List<Llamada> llamadas) {
		this.llamadas = llamadas;
	}
	
	public Cliente(List<Llamada> llamadas, String nombre, String numeroTelefono) {
		this.llamadas = llamadas;
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	public double calcularMontoTotalLlamadas(Empresa empresa) {	
		return this.llamadas.stream().mapToDouble(llamada->llamada.costoPorTipoDeLlamada()-(multiplicadorCostoPorTipoDeCliente(llamada.costoPorTipoDeLlamada()))).sum();
	}
	
	public abstract double multiplicadorCostoPorTipoDeCliente(double auxc);
}
