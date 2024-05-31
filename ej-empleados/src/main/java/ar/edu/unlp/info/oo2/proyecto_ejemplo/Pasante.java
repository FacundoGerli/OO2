package ar.edu.unlp.info.oo2.proyecto_ejemplo;

public class Pasante extends Empleado{

	private int examenes_rendidos;
	
	
	public Pasante(Long id, String nombre, int examenes_rendidos) {
		super(id, nombre);
		this.examenes_rendidos = examenes_rendidos;
	}

	public int getExamenes_rendidos() {
		return examenes_rendidos;
	}

	public void setExamenes_rendidos(int examenes_rendidos) {
		this.examenes_rendidos = examenes_rendidos;
	}

	@Override
	public double sueldoBase() {
		return 20000;
	}

	@Override
	public double adicionales() {
		return examenes_rendidos * 2000;
	}
	

}
