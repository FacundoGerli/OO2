package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.List;

public class PersonaFisica extends Cliente {
	private String DNI;
	
	public PersonaFisica() {	
	}
	public PersonaFisica(List<Llamada> llamadas, String nombre, String numeroTelefono, String DNI) {
		super(llamadas, nombre, numeroTelefono);
		this.DNI = DNI;
	}
	public  double multiplicadorCostoPorTipoDeCliente(double auxc) {
		return auxc*Empresa.getDescuentoPersonaFisica();
}
	public String getDNI() {
		return this.DNI;
	}
	public void setDNI(String dni) {
		this.DNI= dni;
	}
	
}