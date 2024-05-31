package fileSystem;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends FileSystem {
	private ArrayList<FileSystem> contenido;
	
	public Directorio(String nombre, Date fecha_creacion, ArrayList<FileSystem> contenido) {
		super(nombre,fecha_creacion);
		this.contenido = contenido;
	}
	public int getTamaño() {
		return 32000;// contenido minimo solo por ser un directorio
	}
	
	public ArrayList<FileSystem> getContenido() {
		return contenido;
	}
	public void setContenido(ArrayList<FileSystem> contenido) {
		this.contenido = contenido;
	}
	
//---------- implementacion de codigo pedido
	/**
     * Retorna un String con los nombres de los elementos contenidos en todos los 
     * niveles del filesystem. De cada elemento debe retornar el path completo
     * (similar al comando pwd de linux) siguiendo el modelo presentado a
     * continuación
     /Directorio A
     /Directorio A/Directorio A.1
     /Directorio A/Directorio A.1/Directorio A.1.1
     /Directorio A/Directorio A.1/Directorio A.1.2 	
     /Directorio A/Directorio A.2
     /Directorio B
     */
	public String listadoDeContenido() {
		return null;
	}
	private void recorrerRecursivo(ArrayList<FileSystem>files, FileSystem file,String nombre) {
		if(file == null) return ;
		if(file.getNombre().contentEquals(nombre))files.add(file);
		if(file instanceof Directorio) {
			for(FileSystem contenido: ((Directorio) file).getContenido()) {
				recorrerRecursivo(files,contenido,nombre);
			}
		}
	}
	  /**
     * Retorna la lista con los elementos que coinciden con el nombre solicitado 
     * contenido en cualquier nivel del filesystem
     */
      public List<FileSystem> buscarTodos(String nombre){
    	 ArrayList<FileSystem> files = new ArrayList<FileSystem>();
    	 for(FileSystem contenido:this.getContenido()) {
    		 recorrerRecursivo(files,contenido,nombre);
    	 }
    	 return files;
      }
	
      /**
       * Retorna el primer elemento con el nombre solicitado contenido en cualquier
       * nivel del filesystem
       */
       public FileSystem buscar(String nombre){   
    	   return buscarTodos(nombre).get(0); //Solucion ineficiente
       }
    		   
	@Override
	public int tamanoTotalOcupado() {
		return this.getContenido().stream().mapToInt(contenido->contenido.tamanoTotalOcupado()).sum() + 32;//tamaño default del directorio
	}
	@Override
	public Archivo archivoMasGrande() {
		return this.contenido.stream().map(file -> file.archivoMasGrande()).max((a1,a2) -> Integer.compare(a1.tamanoTotalOcupado(),a2.tamanoTotalOcupado())).orElse(null);	
		}
	@Override
	public Archivo archivoMasNuevo() {
		// TODO Auto-generated method stub
		return this.contenido.stream().map(file -> file.archivoMasNuevo()).max((a1,a2) -> a1.getFecha_creacion().compareTo(a2.getFecha_creacion())).orElse(null);
	}
}
