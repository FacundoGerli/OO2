package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.List;

public class PersonaJuridica extends Cliente {
	private String cuit;
	
	public PersonaJuridica(List<Llamada> llamadas, String nombre, String numeroTelefono, String cuit) {
		super(llamadas, nombre, numeroTelefono);
		this.cuit = cuit;
	}
	public PersonaJuridica() {
	}
	
	
	public  double multiplicadorCostoPorTipoDeCliente(double auxc) {
		return auxc*Empresa.getDescuentoPersonaJuridica();
}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
}