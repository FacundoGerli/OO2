package fileSystem;

import java.util.Date;

public class Archivo extends FileSystem {
	private int tamaño;
	
	
	public Archivo(String nombre, Date fecha_creacion, int tamaño) {
		super(nombre,fecha_creacion);
		this.tamaño = tamaño;
	}
	
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public int tamanoTotalOcupado() {
		return this.getTamaño();
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		// TODO Auto-generated method stub
		return this;
	}
	
	

}