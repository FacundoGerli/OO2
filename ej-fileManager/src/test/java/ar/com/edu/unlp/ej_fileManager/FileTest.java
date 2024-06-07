package ar.com.edu.unlp.ej_fileManager;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileTest {
	private Archivo file;
	private Archivo name;
	private Archivo extension;
	private Archivo size;
	private Archivo dateCreated;
	private Archivo dateModified;
	private Archivo permissions;
	
	@BeforeEach
	void setUp() throws Exception {
		this.file = new ConcreteArchivo ("The Next Best American Record", ".mp3", 10.5, LocalDate.of(2019, 8, 30), LocalDate.of(2019, 8, 30), "rwxr-xr-x");
		
	}

	@Test
	void testPrettyPrintOption1() { 
		//name - extension
		this.name = new NombreDecorator(file);  
		this.extension = new ExtensionDecorator(name);
		
		assertEquals("Datos del archivo:\n The Next Best American Record .mp3",this.extension.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption2() { 
		//name - extension - date created
		this.name = new NombreDecorator(file);  
		this.extension = new ExtensionDecorator(name);
		this.dateCreated = new FechaCreacionDecorator(extension);
		
		assertEquals("Datos del archivo:\n The Next Best American Record .mp3 2019-08-30",this.dateCreated.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption3() { 
		//permissions - name - extension - size
		this.permissions = new PermisosDecorator(file);  
		this.name = new NombreDecorator(permissions);
		this.extension = new ExtensionDecorator(name);
		this.size = new TamañoDecorator(extension);
		
		assertEquals("Datos del archivo:\n rwxr-xr-x The Next Best American Record .mp3 10.5 MB",this.size.prettyPrint());
	}
}
