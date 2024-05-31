package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();
//rename
	private static double descuentoPersonaJuridica = 0.15;
	private static double descuentoPersonaFisica = 0;
	
	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}

	public Cliente registrarPersonaFisica(String data, String nombre) {
			PersonaFisica var = new PersonaFisica(new ArrayList<Llamada>(),nombre,this.obtenerNumeroLibre(),data);
			clientes.add(var);
			return var;
			}
	
	public Cliente registrarPersonaJuridica(String data, String nombre) {
		PersonaJuridica var = new PersonaJuridica(new ArrayList<Llamada>(),nombre,this.obtenerNumeroLibre(),data);
		clientes.add(var);
		return var;
	}
	
	public Llamada registrarLlamadaInternacional(Cliente origen,Cliente destino, int duracion) {
		Llamada llamada = new LlamadaInternacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		agregarLlamadaAListas(origen, llamada);
		return llamada;
	}
	public Llamada registrarLlamadaNacional(Cliente origen,Cliente destino, int duracion) {
		Llamada llamada = new LlamadaNacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		agregarLlamadaAListas(origen, llamada);
		return llamada;
	}
	
	private void agregarLlamadaAListas(Cliente origen, Llamada llamada) {
		llamadas.add(llamada);
		origen.getLlamadas().add(llamada);
	}
	

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
	public static double getDescuentoPersonaJuridica() {
		return descuentoPersonaJuridica;
	}
	public static void setDescuentoPersonaJuridica(double valor) {
		Empresa.descuentoPersonaJuridica = valor;
	}
	public static double getDescuentoPersonaFisica() {
		return descuentoPersonaFisica;
	}
	public static void setDescuentoPersonaFisica(double valor) {
		Empresa.descuentoPersonaFisica = valor;
	}
	
}
