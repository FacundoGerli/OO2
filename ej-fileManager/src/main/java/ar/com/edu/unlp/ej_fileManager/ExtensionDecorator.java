package ar.com.edu.unlp.ej_fileManager;

public class ExtensionDecorator extends ArchivoDecorator {

	public ExtensionDecorator(Archivo archivo) {
		super(archivo);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getExtension();
	}

}
