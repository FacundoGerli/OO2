package ar.edu.unlp.info.oo2.proyecto_ejemplo;

public class Temporario extends Empleado {
	
	private double hsTrabajadas;
	private boolean casado;
	private int cant_hijos;
	
	public Temporario(Long id, String nombre, double hsTrabajadas, boolean casado, int cant_hijos) {
		super(id, nombre);
		this.hsTrabajadas = hsTrabajadas;
		this.casado = casado;
		this.cant_hijos = cant_hijos;
	}

	public double getHsTrabajadas() {
		return hsTrabajadas;
	}
	public void setHsTrabajadas(double hsTrabajadas) {
		this.hsTrabajadas = hsTrabajadas;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public int getCant_hijos() {
		return cant_hijos;
	}
	public void setCant_hijos(int cant_hijos) {
		this.cant_hijos = cant_hijos;
	}
	@Override
	public double sueldoBase() {
		return 20000 + hsTrabajadas *300;
	}
	@Override
	public double adicionales() {
		double adicional=0;
		if(casado) adicional+=5000;
		adicional+=cant_hijos*2000;
		return adicional;
	}
}
