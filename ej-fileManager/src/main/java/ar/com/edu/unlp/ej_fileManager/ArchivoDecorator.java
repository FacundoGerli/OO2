package ar.com.edu.unlp.ej_fileManager;

public abstract class ArchivoDecorator implements Archivo{
	private Archivo archivo;

	public ArchivoDecorator(Archivo archivo) {
		this.archivo = archivo;
	}

	@Override
	public String prettyPrint() {
		return this.archivo.prettyPrint() + " ";
	}
	
	@Override
	public String getNombre() {
		return this.archivo.getNombre();
	}
	@Override
	public String getExtension() {
		return this.archivo.getExtension();
	}

	@Override
	public String getFechaCreacion() {
		return this.archivo.getFechaCreacion();
	}

	@Override
	public String getTamaño() {
		return this.archivo.getTamaño();
	}

	@Override
	public String getFechaModificacion() {
		return this.archivo.getFechaModificacion();
	}

	@Override
	public String getPermisos() {
		return this.archivo.getPermisos();
	}
	
	}
