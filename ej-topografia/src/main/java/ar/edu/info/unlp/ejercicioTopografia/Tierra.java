package ar.edu.info.unlp.ejercicioTopografia;

public class Tierra extends Topografia {

	@Override
	public double cantidadAgua() {
		return 0;
	}

	@Override
	public Boolean esIgual(Topografia topo) {
	    return topo.igualTierra();
	}

	@Override
	public Boolean igualTierra() {
		return true;
	}
	@Override
	public Boolean igualAgua() {
		return false;
	}
	@Override
	public Boolean igualMixta(Mixta topo) {
		return false;
	}

	@Override
	public Boolean igualPantano() {
		return false;
	}

}
