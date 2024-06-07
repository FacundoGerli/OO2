package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private DatabaseAccess database;
    private DatabaseProxy proxy;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.proxy = new DatabaseProxy(database);
    }

    @Test
    void testGetSearchResults() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
    @Test
    void testAcceso() {
    	Exception errorAcceso = Assertions.assertThrows(RuntimeException.class,() ->{this.proxy.getSearchResults("select * from comics where id=1");});
    	assertEquals("Acceso denegado",errorAcceso.getMessage().toString());
    	errorAcceso = Assertions.assertThrows(RuntimeException.class, () -> {this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));});
    	assertEquals("Acceso denegado",errorAcceso.getMessage().toString());
    	
    	proxy.logIn();
    	  assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
          assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
    }
}