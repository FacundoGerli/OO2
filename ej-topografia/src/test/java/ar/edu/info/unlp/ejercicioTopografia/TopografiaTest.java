package ar.edu.info.unlp.ejercicioTopografia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TopografiaTest {
	
	@Test
	public void testAgua() {
		Agua agua = new Agua();
		assertEquals(true, agua.igualAgua());
		assertEquals(false,agua.igualTierra());
		assertEquals(false,agua.igualMixta(null));
		assertEquals(1,agua.cantidadAgua());
		assertEquals(0,agua.cantidadTierra());
	}
	@Test
	public void testTierra() {
		Tierra tierra = new Tierra();
		assertEquals(true,tierra.igualTierra());
		assertEquals(false,tierra.igualAgua());
		assertEquals(false,tierra.igualMixta(null));
		assertEquals(1,tierra.cantidadTierra());
		assertEquals(0,tierra.cantidadAgua());
	}
	@Test
	public void testMixta() {
		Agua agua = new Agua();
		Tierra tierra = new Tierra();
		ArrayList<Topografia> composicion = new ArrayList<Topografia>();
		composicion.add(tierra);
		composicion.add(tierra);
		composicion.add(agua);
		composicion.add(agua);
		Mixta mixta = new Mixta(composicion); 
		ArrayList<Topografia> opuestaComp = new ArrayList<Topografia>();
		opuestaComp.add(agua);
		opuestaComp.add(agua);
		opuestaComp.add(tierra);
		opuestaComp.add(tierra);
		
		Mixta opuesta= new Mixta(new ArrayList<Topografia>(opuestaComp));//inicializacion
		
		assertEquals(false,mixta.igualTierra());
		assertEquals(false,mixta.igualAgua());
		assertEquals(true,mixta.igualMixta(mixta));
		assertEquals(false,mixta.igualMixta(opuesta));
		assertEquals(0.5,mixta.cantidadTierra());
		assertEquals(0.5,mixta.cantidadAgua());
		
	}

}
