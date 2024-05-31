package ar.edu.unlp.info.oo2.proyecto_ejemplo;

public abstract class Empleado {
	private Long id;
	private String nombre;
	
	public Empleado(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	public Empleado() {
		
	}
	

	public double getSueldo() {
		return this.sueldoBase() + this.adicionales() - this.descuento();
	}
	public double descuento() {
		return this.sueldoBase()* 0.13 + this.adicionales() * 0.05;
	}
	public abstract double sueldoBase();
	public abstract double adicionales();

	
	
	
}
