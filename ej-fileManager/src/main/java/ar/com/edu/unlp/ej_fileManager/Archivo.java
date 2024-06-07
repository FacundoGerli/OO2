package ar.com.edu.unlp.ej_fileManager;

import java.util.Date;

public interface Archivo{
	public String prettyPrint();
	public String getNombre();
	public String getExtension();
	public String getFechaCreacion();
	public String getTamaño();
	public String getFechaModificacion();
	public String getPermisos();
}


