package ar.com.edu.unlp.ej_fileManager;

import java.time.LocalDate;

public class ConcreteArchivo implements Archivo {
	private String nombre;
	private String extension;
	private double tamaño;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	public ConcreteArchivo(String nombre, String extension, double tamaño, LocalDate fechaCreacion, LocalDate fechaModificacion,
			String permisos) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tamaño = tamaño;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.permisos = permisos;
	}
	
	@Override
	public String prettyPrint() {
		return "Datos del archivo:\n";
	}
//Geters y seters
	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	@Override
	public String getTamaño() {
		return Double.toString(this.tamaño);
	}
	@Override
	public String getFechaCreacion() {
		return this.fechaCreacion.toString();
	}
	@Override
	public String getFechaModificacion() {
		return this.fechaModificacion.toString();
	}
	
	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
	public String getPermisos() {
		return permisos;
	}

	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}

	
	

}
