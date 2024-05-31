package ar.edu.info.unlp.ejercicioTopografia;

public abstract class Topografia {
	
	public abstract double cantidadAgua();
	public  double cantidadTierra() {
		return (1 - this.cantidadAgua());
	}
	public abstract Boolean esIgual(Topografia topo);
	public abstract Boolean igualTierra();
	public abstract Boolean igualAgua();
	public abstract Boolean igualMixta(Mixta topo);
	public abstract Boolean igualPantano();
	
}
