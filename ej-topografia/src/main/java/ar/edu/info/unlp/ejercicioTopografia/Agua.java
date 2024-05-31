package ar.edu.info.unlp.ejercicioTopografia;

public class Agua extends Topografia {

	@Override
	public double cantidadAgua() {
		return 1;
	}


	@Override
	public Boolean esIgual(Topografia topo) {
		return topo.igualAgua();
	}


	@Override
	public Boolean igualTierra() {
		return false;
	}


	@Override
	public Boolean igualAgua() {
		return true;
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
