package ar.com.edu.unlp.ej_fileManager;

public class TamañoDecorator extends ArchivoDecorator{

	public TamañoDecorator(Archivo archivo) {
		super(archivo);
		// TODO Auto-generated constructor stub
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getTamaño()+" MB";
	}


}
