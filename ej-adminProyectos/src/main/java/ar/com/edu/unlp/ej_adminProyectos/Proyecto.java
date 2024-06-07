package ar.com.edu.unlp.ej_adminProyectos;

import java.time.LocalDateTime;

public class Proyecto {
	private String objetivo;
	private double costoIntegrante;
	private int numeroIntegrantes;
	private double margenGanancia;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private State state;
	
	public Proyecto(String objetivo, int numeroIntegrantes, double costoIntegrante,LocalDateTime fechaInicio,
			LocalDateTime fechaFin) {
		super();
		this.objetivo = objetivo;
		this.numeroIntegrantes = numeroIntegrantes;
		this.margenGanancia = 0.07;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.costoIntegrante = costoIntegrante;
		this.state = new EnConstruccion(this);
	}
	
	
	
	public double calcularCostoProyecto() {
		return numeroIntegrantes * this.costoIntegrante;
	}
	public double calcularPrecioProyecto() {
		return this.calcularCostoProyecto() * this.margenGanancia;
	}
	public void cancelarProyecto() {
		this.setObjetivo("Cancelado");
	}
//Geters and Setters
	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public int getNumeroIntegrantes() {
		return numeroIntegrantes;
	}

	public void setNumeroIntegrantes(int numeroIntegrantes) {
		this.numeroIntegrantes = numeroIntegrantes;
	}

	public double getMargenGanancia() {
		return margenGanancia;
	}

	public void setMargenGanancia(double margenGanancia) {
		this.margenGanancia = margenGanancia;
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

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
	

	
}
