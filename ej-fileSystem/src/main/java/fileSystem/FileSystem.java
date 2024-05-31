package fileSystem;

import java.util.Date;

public abstract class FileSystem {
	private String nombre;
	private Date fecha_creacion;
	
	
	public FileSystem(String nombre, Date fecha_creacion) {
		super();
		this.nombre = nombre;
		this.fecha_creacion = fecha_creacion;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}




	/**
	* Retorna el espacio total ocupado, incluyendo todo su contenido.
	*/
	       public abstract int tamanoTotalOcupado() ;
	       
	       
	    	/**
	* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
	* filesystem 
	*/
	       public abstract Archivo archivoMasGrande();
	       /**
	       * Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	       * del filesystem
	       */
	       public abstract Archivo archivoMasNuevo();
	   

	     

	       

	       

}
