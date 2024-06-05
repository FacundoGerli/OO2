package ar.com.edu.unlp.ej_Excursiones;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private State estado;
	private List<Usuario> listaAnotados;
	private List<Usuario> listaEspera;
	
	
	
	public Excursion(String nombre, LocalDateTime fechaInicio, LocalDateTime fechaFin, String puntoEncuentro,
			double costo, int cupoMinimo, int cupoMaximo) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.estado = new Provisoria(this);
		listaEspera = new ArrayList<Usuario>();
		listaAnotados = new ArrayList<Usuario>();
	}
	@Override
	public String toString() {
		return this.getEstado().toString();
	}
	public void reservarCupo(Usuario user) {
		this.getEstado().reservarCupo(user);
	}
	public State getEstado() {
		return estado;
	}
	public void setEstado(State estado) {
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDateTime getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}
	public void setPuntoEncuentro(String puntoEncuentro) {
		this.puntoEncuentro = puntoEncuentro;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public int getCupoMinimo() {
		return cupoMinimo;
	}
	public void setCupoMinimo(int cupoMinimo) {
		this.cupoMinimo = cupoMinimo;
	}
	public int getCupoMaximo() {
		return cupoMaximo;
	}
	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}
	public List<Usuario> getListaAnotados() {
		return listaAnotados;
	}
	public void setListaAnotados(List<Usuario> listaAnotados) {
		this.listaAnotados = listaAnotados;
	}
	public List<Usuario> getListaEspera() {
		return listaEspera;
	}
	public void setListaEspera(List<Usuario> listaEspera) {
		this.listaEspera = listaEspera;
	}
	
	
}
