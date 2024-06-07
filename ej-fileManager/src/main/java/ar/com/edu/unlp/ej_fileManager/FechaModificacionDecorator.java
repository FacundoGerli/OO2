package ar.com.edu.unlp.ej_fileManager;

public class FechaModificacionDecorator extends ArchivoDecorator {

	public FechaModificacionDecorator(Archivo archivo) {
		super(archivo);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getFechaModificacion();
	}

	

}
