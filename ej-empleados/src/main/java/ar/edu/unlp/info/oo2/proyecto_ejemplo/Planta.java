package ar.edu.unlp.info.oo2.proyecto_ejemplo;

public class Planta extends Empleado {
	private boolean casado;
	private int cant_hijos;
	private int antiguedad;
	
	
	public Planta(Long id,String nombre,boolean casado, int cant_hijos, int antiguedad) {
		super(id, nombre);
		this.casado = casado;
		this.cant_hijos = cant_hijos;
		this.antiguedad = antiguedad;
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
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	@Override
	public double sueldoBase() {
		return 50000;
	}
	@Override
	public double adicionales() {
		double adicional = 0;
		if(casado) adicional+=5000;
		adicional+=2000 * cant_hijos;
		adicional+=2000*antiguedad;
		return adicional;
	}
	
	
}
