package ar.com.edu.unlp.ej_fileManager;

import java.util.Date;

public class NombreDecorator extends ArchivoDecorator {

	public NombreDecorator(Archivo archivo) {
		super(archivo);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getNombre();
	}

}
